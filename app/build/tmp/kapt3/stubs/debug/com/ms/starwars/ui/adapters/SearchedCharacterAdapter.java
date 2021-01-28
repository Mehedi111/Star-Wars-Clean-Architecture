package com.ms.starwars.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\u00020\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0002`\bR \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0002`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ms/starwars/models/CharacterEntity;", "Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter$SearchedCharacterViewHolder;", "()V", "onItemClick", "Lkotlin/Function1;", "", "Lcom/ms/starwars/ui/adapters/ClickListener;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "Companion", "SearchedCharacterViewHolder", "app_debug"})
public final class SearchedCharacterAdapter extends androidx.recyclerview.widget.ListAdapter<com.ms.starwars.models.CharacterEntity, com.ms.starwars.ui.adapters.SearchedCharacterAdapter.SearchedCharacterViewHolder> {
    private kotlin.jvm.functions.Function1<? super com.ms.starwars.models.CharacterEntity, kotlin.Unit> onItemClick;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ms.starwars.models.CharacterEntity> diffCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ms.starwars.ui.adapters.SearchedCharacterAdapter.Companion Companion = null;
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.ms.starwars.models.CharacterEntity, kotlin.Unit> listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ms.starwars.ui.adapters.SearchedCharacterAdapter.SearchedCharacterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ms.starwars.ui.adapters.SearchedCharacterAdapter.SearchedCharacterViewHolder holder, int position) {
    }
    
    @javax.inject.Inject()
    public SearchedCharacterAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fj\u0002`\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter$SearchedCharacterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ms/starwars/databinding/LayoutCharacterItemBinding;", "(Lcom/ms/starwars/databinding/LayoutCharacterItemBinding;)V", "getBinding", "()Lcom/ms/starwars/databinding/LayoutCharacterItemBinding;", "bindListener", "", "item", "Lcom/ms/starwars/models/CharacterEntity;", "onItemClick", "Lkotlin/Function1;", "Lcom/ms/starwars/ui/adapters/ClickListener;", "app_debug"})
    public static final class SearchedCharacterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.ms.starwars.databinding.LayoutCharacterItemBinding binding = null;
        
        public final void bindListener(@org.jetbrains.annotations.NotNull()
        com.ms.starwars.models.CharacterEntity item, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.ms.starwars.models.CharacterEntity, kotlin.Unit> onItemClick) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.databinding.LayoutCharacterItemBinding getBinding() {
            return null;
        }
        
        public SearchedCharacterViewHolder(@org.jetbrains.annotations.NotNull()
        com.ms.starwars.databinding.LayoutCharacterItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ms/starwars/ui/adapters/SearchedCharacterAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ms/starwars/models/CharacterEntity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}