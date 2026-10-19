package androidx.compose.runtime.saveable;

import Ia.l;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SaveableStateHolderImpl$canBeSaved$1 extends Lambda implements l<Object, Boolean> {
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$canBeSaved$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
    }

    @Override // Ia.l
    public final Boolean invoke(Object obj) {
        f fVar = this.this$0.f13127c;
        return Boolean.valueOf(fVar != null ? fVar.a(obj) : true);
    }
}
