package p241t7;

import A0.f;
import A1.C0578m;
import A1.F;
import A1.K;
import A1.r;
import J0.a;
import android.text.Spanned;
import android.view.View;
import androidx.core.view.ViewKt;
import androidx.emoji2.text.c;
import androidx.media3.exoplayer.V;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.models.AttributeType;
import io.ktor.http.C;
import io.ktor.http.C2476a;
import io.ktor.http.CodecsKt;
import io.ktor.http.e;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import kotlin.sequences.h;
import kotlin.text.m;
import kotlinx.coroutines.channels.p;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: compiled from: LogWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f47354b;

    /* JADX WARN: Type inference failed for: r3v2, types: [Ia.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    public static final void a(View view) {
        i.e(view, "<this>");
        h hVarN = C1787c0.n(ViewKt.a(view).f43102a);
        while (hVarN.hasNext()) {
            ArrayList<a> arrayList = t((View) hVarN.next()).f3959a;
            for (int iR = l.r(arrayList); -1 < iR; iR--) {
                arrayList.get(iR).a();
            }
        }
    }

    public static final void b(p pVar, Throwable th) {
        CancellationException cancellationExceptionB = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionB == null) {
            cancellationExceptionB = kotlin.jvm.internal.h.b("Channel was consumed, consumer had failed", th);
        }
        pVar.i(cancellationExceptionB);
    }

    public static final Charset c(C2476a c2476a) {
        String str;
        i.e(c2476a, "<this>");
        List list = (List) c2476a.f9363c;
        int iR = l.r(list);
        if (iR < 0) {
            str = null;
            break;
        }
        int i10 = 0;
        while (true) {
            e eVar = (e) list.get(i10);
            if (!m.D(eVar.f40476a, "charset", true)) {
                if (i10 == iR) {
                    str = null;
                    break;
                }
                i10++;
            } else {
                str = eVar.f40477b;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void d(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void e(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(V v10) {
        v10.getClass();
    }

    public static void i(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void k(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static final void n(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                D2.V.e(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int o(int i10, String str) {
        c cVarA;
        int spanEnd;
        Integer num = null;
        if (c.d()) {
            cVarA = c.a();
            if (cVarA.c() != 1) {
                cVarA = null;
            }
        } else {
            cVarA = null;
        }
        if (cVarA != null) {
            if (!(cVarA.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            f.f(str, "charSequence cannot be null");
            R0.h hVar = cVarA.f17347e.f17352b;
            hVar.getClass();
            if (i10 < 0 || i10 >= str.length()) {
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                R0.i[] iVarArr = (R0.i[]) spanned.getSpans(i10, i10 + 1, R0.i.class);
                if (iVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(iVarArr[0]);
                } else {
                    spanEnd = ((R0.h.c) hVar.c(str, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), BrazeLogger.SUPPRESS, true, new R0.h.c(i10))).f5159c;
                }
            } else {
                spanEnd = ((R0.h.c) hVar.c(str, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), BrazeLogger.SUPPRESS, true, new R0.h.c(i10))).f5159c;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            if (spanEnd != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final int q(int i10, String str) {
        c cVarA;
        Integer num = null;
        if (c.d()) {
            cVarA = c.a();
            if (cVarA.c() != 1) {
                cVarA = null;
            }
        } else {
            cVarA = null;
        }
        if (cVarA != null) {
            int iB = cVarA.b(str, Math.max(0, i10 - 1));
            Integer numValueOf = Integer.valueOf(iB);
            if (iB != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    public static final Class r(Oa.c cVar) {
        i.e(cVar, "<this>");
        Class<?> clsH = ((kotlin.jvm.internal.b) cVar).h();
        i.c(clsH, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsH;
    }

    public static final Class s(Oa.c cVar) {
        i.e(cVar, "<this>");
        Class<?> clsH = ((kotlin.jvm.internal.b) cVar).h();
        if (!clsH.isPrimitive()) {
            return clsH;
        }
        String name = clsH.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsH : Double.class;
            case 104431:
                return !name.equals("int") ? clsH : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsH : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsH : Character.class;
            case 3327612:
                return !name.equals("long") ? clsH : Long.class;
            case 3625364:
                return !name.equals("void") ? clsH : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsH : Boolean.class;
            case 97526364:
                return !name.equals(AttributeType.FLOAT) ? clsH : Float.class;
            case 109413500:
                return !name.equals("short") ? clsH : Short.class;
            default:
                return clsH;
        }
    }

    public static final J0.b t(View view) {
        J0.b bVar = (J0.b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar != null) {
            return bVar;
        }
        J0.b bVar2 = new J0.b();
        view.setTag(R.id.pooling_container_listener_holder_tag, bVar2);
        return bVar2;
    }

    public static final void u(io.ktor.client.request.a aVar, String key, Object obj) {
        i.e(aVar, "<this>");
        i.e(key, "key");
        if (obj != null) {
            aVar.f40412c.d(key, obj.toString());
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public static final void v(io.ktor.client.request.a aVar, String name, Object obj) {
        i.e(name, "key");
        if (obj != null) {
            C c10 = aVar.f40410a.j;
            String value = obj.toString();
            c10.getClass();
            i.e(name, "name");
            i.e(value, "value");
            c10.f40456a.d(CodecsKt.f(name, false), CodecsKt.f(value, true));
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public static final void w(int i10, int i11, p011ab.e descriptor) {
        i.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.g(i13));
            }
            i12 >>>= 1;
        }
        String serialName = descriptor.a();
        i.e(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    public static boolean x(byte b10) {
        return b10 > -65;
    }

    @Override // A1.r
    public K p(int i10, int i11) {
        return new C0578m();
    }

    @Override // A1.r
    public void j() {
    }

    @Override // A1.r
    public void g(F f10) {
    }
}
