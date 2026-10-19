package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.C1108r0;
import java.io.Serializable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1221g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<? extends Object>[] f15045a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.k) {
            androidx.compose.runtime.snapshots.k kVar = (androidx.compose.runtime.snapshots.k) obj;
            if (kVar.a() != androidx.compose.runtime.Z.f12934a && kVar.a() != androidx.compose.runtime.Q0.f12888a && kVar.a() != C1108r0.f13116a) {
                return false;
            }
            T value = kVar.getValue();
            if (value == 0) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof p293xa.e) && (obj instanceof Serializable)) {
            return false;
        }
        Class<? extends Object>[] clsArr = f15045a;
        for (int i10 = 0; i10 < 7; i10++) {
            if (clsArr[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
