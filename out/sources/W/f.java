package W;

import Ia.l;
import Ia.p;
import android.util.Log;
import androidx.compose.runtime.saveable.i;
import androidx.compose.runtime.saveable.j;
import com.google.android.gms.internal.measurement.InterfaceC1884q;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.Y1;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d, i, K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6997c;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f6996b = obj;
        this.f6997c = obj2;
    }

    @Override // androidx.compose.runtime.saveable.i
    public Object a(Object obj) {
        return ((l) this.f6997c).invoke(obj);
    }

    @Override // com.google.android.gms.internal.measurement.K
    public Y1 b(InterfaceC1884q interfaceC1884q) {
        Y1 y1D = ((Y1) this.f6996b).d();
        String str = (String) this.f6997c;
        y1D.e(str, interfaceC1884q);
        y1D.f25644d.put(str, Boolean.TRUE);
        return y1D;
    }

    @Override // androidx.compose.runtime.saveable.i
    public Object c(j jVar, Object obj) {
        return ((p) this.f6996b).invoke(jVar, obj);
    }

    public void d() {
        String str = (String) this.f6996b;
        try {
            D6.f fVar = (D6.f) this.f6997c;
            fVar.getClass();
            new File(fVar.f2815b, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    @Override // W.d
    public int p(int i10) {
        CharSequence charSequence;
        do {
            i10 = ((e) this.f6997c).h(i10);
            if (i10 != -1) {
                charSequence = (CharSequence) this.f6996b;
                if (i10 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override // W.d
    public int q(int i10) {
        do {
            i10 = ((e) this.f6997c).i(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f6996b).charAt(i10 - 1)));
        return i10;
    }

    @Override // W.d
    public int y(int i10) {
        do {
            i10 = ((e) this.f6997c).i(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f6996b).charAt(i10)));
        return i10;
    }

    @Override // W.d
    public int z(int i10) {
        do {
            i10 = ((e) this.f6997c).h(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f6996b).charAt(i10 - 1)));
        return i10;
    }
}
