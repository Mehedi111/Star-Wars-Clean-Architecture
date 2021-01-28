// Generated by view binder compiler. Do not edit!
package com.ms.starwars.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ms.starwars.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutCharacterItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView characterBirthYearTextView;

  @NonNull
  public final ImageView characterImageView;

  @NonNull
  public final TextView characterNameTextView;

  @NonNull
  public final ImageView moreInfoArrowImageButton;

  private LayoutCharacterItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView characterBirthYearTextView, @NonNull ImageView characterImageView,
      @NonNull TextView characterNameTextView, @NonNull ImageView moreInfoArrowImageButton) {
    this.rootView = rootView;
    this.characterBirthYearTextView = characterBirthYearTextView;
    this.characterImageView = characterImageView;
    this.characterNameTextView = characterNameTextView;
    this.moreInfoArrowImageButton = moreInfoArrowImageButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutCharacterItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutCharacterItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_character_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutCharacterItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.character_birth_year_text_view;
      TextView characterBirthYearTextView = rootView.findViewById(id);
      if (characterBirthYearTextView == null) {
        break missingId;
      }

      id = R.id.character_image_view;
      ImageView characterImageView = rootView.findViewById(id);
      if (characterImageView == null) {
        break missingId;
      }

      id = R.id.character_name_text_view;
      TextView characterNameTextView = rootView.findViewById(id);
      if (characterNameTextView == null) {
        break missingId;
      }

      id = R.id.more_info_arrow_image_button;
      ImageView moreInfoArrowImageButton = rootView.findViewById(id);
      if (moreInfoArrowImageButton == null) {
        break missingId;
      }

      return new LayoutCharacterItemBinding((ConstraintLayout) rootView, characterBirthYearTextView,
          characterImageView, characterNameTextView, moreInfoArrowImageButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}