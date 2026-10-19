package androidx.compose.runtime.saveable;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final SaveableStateHolderImpl a(InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-796079677);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) b.c(new Object[0], SaveableStateHolderImpl.f13124e, null, new Ia.a<SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$rememberSaveableStateHolder$1
            @Override // Ia.a
            public final SaveableStateHolderImpl invoke() {
                return new SaveableStateHolderImpl(0);
            }
        }, interfaceC1084f, 3072, 4);
        saveableStateHolderImpl.f13127c = (f) interfaceC1084f.x(SaveableStateRegistryKt.f13132a);
        interfaceC1084f.D();
        return saveableStateHolderImpl;
    }
}
