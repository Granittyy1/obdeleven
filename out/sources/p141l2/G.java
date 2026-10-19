package p141l2;

import C.e;
import android.os.Bundle;
import androidx.compose.foundation.gestures.d;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.survey.ui.components.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import p163n2.k;
import p163n2.m;
import p271w0.c;

/* JADX INFO: compiled from: NavGraphNavigator.kt */
/* JADX INFO: loaded from: classes.dex */
@P.b("navigation")
public class G extends P<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f44239c;

    public G(Q navigatorProvider) {
        i.e(navigatorProvider, "navigatorProvider");
        this.f44239c = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, android.os.Bundle] */
    @Override // p141l2.P
    public final void d(List<C2749t> list, J j, P.a aVar) {
        for (C2749t c2749t : list) {
            C c10 = c2749t.f44299c;
            i.c(c10, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            E e10 = (E) c10;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = c2749t.f44305i.a();
            m mVar = e10.f44235g;
            int i10 = mVar.f44821c;
            String str = mVar.f44823e;
            if (i10 == 0 && str == null) {
                k kVar = e10.f44219c;
                kVar.getClass();
                String superName = String.valueOf(kVar.f44813d);
                i.e(superName, "superName");
                if (mVar.f44819a.f44219c.f44813d == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            C cB = str != null ? mVar.b(str, false) : mVar.f44820b.c(i10);
            if (cB == null) {
                if (mVar.f44822d == null) {
                    String strValueOf = mVar.f44823e;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(mVar.f44821c);
                    }
                    mVar.f44822d = strValueOf;
                }
                String str2 = mVar.f44822d;
                i.b(str2);
                throw new IllegalArgumentException(d.b("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                k kVar2 = cB.f44219c;
                if (!str.equals(kVar2.f44814e)) {
                    C.b bVarA = kVar2.a(str);
                    Bundle bundle = bVarA != null ? bVarA.f44223c : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        y.p();
                        ?? B10 = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        B10.putAll(bundle);
                        Bundle bundle2 = (Bundle) ref$ObjectRef.element;
                        if (bundle2 != null) {
                            B10.putAll(bundle2);
                        }
                        ref$ObjectRef.element = B10;
                    }
                }
                if (cB.q().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListJ = e.j(cB.q(), new a(3, ref$ObjectRef));
                    if (!arrayListJ.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + cB + ". Missing required arguments [" + arrayListJ + ']').toString());
                    }
                }
            }
            this.f44239c.b(cB.f44218b).d(M1.k(b().a(cB, cB.e((Bundle) ref$ObjectRef.element))), j, aVar);
        }
    }

    @Override // p141l2.P
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public E a() {
        return new E(this);
    }
}
