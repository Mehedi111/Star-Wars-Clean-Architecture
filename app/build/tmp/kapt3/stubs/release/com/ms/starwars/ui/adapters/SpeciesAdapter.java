package com.ms.starwars.ui.adapters;

import java.lang.System;

/**
 * Created by Mehedi Hasan on 1/20/2021.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/ms/starwars/ui/adapters/SpeciesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ms/starwars/models/SpecieEntity;", "Lcom/ms/starwars/ui/adapters/SpeciesAdapter$SpeciesViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "SpeciesViewHolder", "app_release"})
public final class SpeciesAdapter extends androidx.recyclerview.widget.ListAdapter<com.ms.starwars.models.SpecieEntity, com.ms.starwars.ui.adapters.SpeciesAdapter.SpeciesViewHolder> {
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ms.starwars.models.SpecieEntity> diffCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ms.starwars.ui.adapters.SpeciesAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ms.starwars.ui.adapters.SpeciesAdapter.SpeciesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ms.starwars.ui.adapters.SpeciesAdapter.SpeciesViewHolder holder, int position) {
    }
    
    @javax.inject.Inject()
    public SpeciesAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ms/starwars/ui/adapters/SpeciesAdapter$SpeciesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ms/starwars/databinding/LayoutSpecieItemBinding;", "(Lcom/ms/starwars/databinding/LayoutSpecieItemBinding;)V", "getBinding", "()Lcom/ms/starwars/databinding/LayoutSpecieItemBinding;", "app_release"})
    public static final class SpeciesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.ms.starwars.databinding.LayoutSpecieItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.ms.starwars.databinding.LayoutSpecieItemBinding getBinding() {
            return null;
        }
        
        public SpeciesViewHolder(@org.jetbrains.annotations.NotNull()
        com.ms.starwars.databinding.LayoutSpecieItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ms/starwars/ui/adapters/SpeciesAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ms/starwars/models/SpecieEntity;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}