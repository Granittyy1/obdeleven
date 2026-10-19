package V7;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1193n;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.internal.measurement.AbstractC1938y;
import com.google.android.gms.internal.measurement.C1904t;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.InterfaceC1884q;
import com.google.android.gms.internal.measurement.M;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.zzbv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import okhttp3.A;
import retrofit2.h;

/* JADX INFO: compiled from: DeserializationStrategyConverter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6731c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void a(LayoutNode layoutNode) {
        if (layoutNode.f14390H.f14630d == LayoutNode.LayoutState.f14429f && !layoutNode.C() && !layoutNode.D() && !layoutNode.f14399Q && layoutNode.r()) {
            androidx.compose.ui.h.c cVar = layoutNode.f14389G.f14368e;
            if ((cVar.f13988e & 256) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 256) != 0) {
                        ?? B10 = cVar;
                        ?? cVar2 = 0;
                        while (B10 != 0) {
                            if (B10 instanceof InterfaceC1193n) {
                                InterfaceC1193n interfaceC1193n = (InterfaceC1193n) B10;
                                interfaceC1193n.w1(C1185f.d(interfaceC1193n, 256));
                            } else if ((B10.f13987d & 256) != 0 && (B10 instanceof AbstractC1187h)) {
                                androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                                int i10 = 0;
                                B10 = B10;
                                cVar2 = cVar2;
                                while (cVar3 != null) {
                                    if ((cVar3.f13987d & 256) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar2 = cVar2;
                                            B10 = cVar3;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (B10 != 0) {
                                                cVar2.b(B10);
                                                B10 = 0;
                                            }
                                            cVar2.b(cVar3);
                                        }
                                    }
                                    cVar3 = cVar3.f13990g;
                                    B10 = B10;
                                    cVar2 = cVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            B10 = C1185f.b(cVar2);
                        }
                    }
                    if ((cVar.f13988e & 256) == 0) {
                        break;
                    } else {
                        cVar = cVar.f13990g;
                    }
                }
            }
        }
        layoutNode.f14398P = false;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i11 = cVarJ.f12945d;
        for (int i12 = 0; i12 < i11; i12++) {
            a(layoutNodeArr[i12]);
        }
    }

    @Override // retrofit2.h
    public Object b(Object obj) throws IOException {
        A value = (A) obj;
        i.e(value, "value");
        Ya.b bVar = (Ya.b) this.f6730b;
        d.a aVar = (d.a) this.f6731c;
        aVar.getClass();
        return aVar.f6737a.a(bVar, value.i());
    }

    public InterfaceC1884q c(Y1 y10, InterfaceC1884q interfaceC1884q) {
        D1.g(y10);
        if (!(interfaceC1884q instanceof C1904t)) {
            return interfaceC1884q;
        }
        C1904t c1904t = (C1904t) interfaceC1884q;
        ArrayList<InterfaceC1884q> arrayList = c1904t.f25845c;
        HashMap map = (HashMap) this.f6730b;
        String str = c1904t.f25844b;
        return (map.containsKey(str) ? (AbstractC1938y) map.get(str) : (M) this.f6731c).a(str, y10, arrayList);
    }

    public void d(AbstractC1938y abstractC1938y) {
        Iterator it = abstractC1938y.f25919a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f6730b).put(((zzbv) it.next()).toString(), abstractC1938y);
        }
    }
}
