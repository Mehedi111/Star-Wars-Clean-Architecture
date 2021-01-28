package com.ms.data.interceptor

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response


/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
object HttpsInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val host = request.url.host

        val requestBuilder: Request.Builder = request.newBuilder()


        // change all network access to use HTTPS to avoid
        // Exception: CLEARTEXT communication not supported
        if (!request.url.isHttps) {
            if (!request.url.toString().contains("localhost")) {
                val url: HttpUrl = request.url.newBuilder().scheme("https").host(host).build()
                requestBuilder.url(url)
            }
        }

        return try {
            chain.proceed(requestBuilder.build())
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }
    }
}