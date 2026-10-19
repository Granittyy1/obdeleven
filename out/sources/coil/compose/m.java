package coil.compose;

import androidx.compose.animation.D;
import java.util.Arrays;

/* JADX INFO: compiled from: EqualityDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22790a = new a();

    /* JADX INFO: compiled from: EqualityDelegate.kt */
    public static final class a implements l {
        @Override // coil.compose.l
        public final boolean a(Object obj, Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof coil.request.g) || !(obj2 instanceof coil.request.g)) {
                return kotlin.jvm.internal.i.a(obj, obj2);
            }
            coil.request.g gVar = (coil.request.g) obj;
            coil.request.g gVar2 = (coil.request.g) obj2;
            return kotlin.jvm.internal.i.a(gVar.f23046a, gVar2.f23046a) && kotlin.jvm.internal.i.a(gVar.f23047b, gVar2.f23047b) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(gVar.f23050e, gVar2.f23050e) && kotlin.jvm.internal.i.a(gVar.f23051f, gVar2.f23051f) && gVar.f23052g == gVar2.f23052g && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(gVar.f23054i, gVar2.f23054i) && kotlin.jvm.internal.i.a(gVar.f23055k, gVar2.f23055k) && gVar.f23057m == gVar2.f23057m && gVar.f23058n == gVar2.f23058n && gVar.f23059o == gVar2.f23059o && gVar.f23060p == gVar2.f23060p && gVar.f23061q == gVar2.f23061q && gVar.f23062r == gVar2.f23062r && gVar.f23063s == gVar2.f23063s && kotlin.jvm.internal.i.a(gVar.f23069y, gVar2.f23069y) && gVar.f23070z == gVar2.f23070z && gVar.f23053h == gVar2.f23053h && kotlin.jvm.internal.i.a(gVar.f23039A, gVar2.f23039A);
        }

        @Override // coil.compose.l
        public final int b(Object obj) {
            if (!(obj instanceof coil.request.g)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            coil.request.g gVar = (coil.request.g) obj;
            int iHashCode = (gVar.f23047b.hashCode() + (gVar.f23046a.hashCode() * 31)) * 961;
            X2.b.a aVar = gVar.f23050e;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            String str = gVar.f23051f;
            return gVar.f23039A.f23113b.hashCode() + ((gVar.f23053h.hashCode() + ((gVar.f23070z.hashCode() + ((gVar.f23069y.hashCode() + ((gVar.f23063s.hashCode() + ((gVar.f23062r.hashCode() + ((gVar.f23061q.hashCode() + D.b(D.b(D.b(D.b((p005a4.p.d((gVar.f23052g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 961, 31, gVar.f23054i) + Arrays.hashCode(gVar.f23055k.f45568b)) * 31, 31, gVar.f23057m), 31, gVar.f23058n), 31, gVar.f23059o), 31, gVar.f23060p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
    }
}
