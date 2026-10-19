package O;

import Ia.p;
import Z3.A;
import Z3.q;
import Z3.y;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.Layout;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.FacebookException;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.play.integrity.internal.j;
import com.google.android.play.integrity.internal.v;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.z;
import org.json.JSONObject;
import p005a4.o;
import p165n4.s;
import p293xa.r;
import p318zb.C2839f;

/* JADX INFO: compiled from: KeyEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s.a, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Q3.d f4722b;

    public static final void A(z zVar, Number number) {
        z.n(zVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String B(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!n.J(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.i.d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (kotlin.jvm.internal.i.g(cCharAt, 31) <= 0 || kotlin.jvm.internal.i.g(cCharAt, 127) >= 0 || n.P(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressK = (m.I(str, "[", false) && m.C(str, "]", false)) ? k(str, 1, str.length() - 1) : k(str, 0, str.length());
        if (inetAddressK == null) {
            return null;
        }
        byte[] address = inetAddressK.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressK.getHostAddress();
            }
            throw new AssertionError(o.c('\'', "Invalid IPv6 address: '", str));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        C2839f c2839f = new C2839f();
        while (i10 < address.length) {
            if (i10 == i11) {
                c2839f.Z0(58);
                i10 += i14;
                if (i10 == 16) {
                    c2839f.Z0(58);
                }
            } else {
                if (i10 > 0) {
                    c2839f.Z0(58);
                }
                byte b10 = address[i10];
                byte[] bArr = p172nb.b.f45026a;
                c2839f.b1(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return c2839f.r0();
    }

    public static final boolean C(PublicKey publicKey, String data, String signature) {
        kotlin.jvm.internal.i.e(data, "data");
        kotlin.jvm.internal.i.e(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(kotlin.text.a.f43120b);
            kotlin.jvm.internal.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            kotlin.jvm.internal.i.d(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void D(String str, String str2) {
        Q3.d dVar = f4722b;
        if (dVar != null) {
            dVar.E(5, str, str2);
        }
    }

    public static final Object E(kotlin.coroutines.e eVar, Object obj, Object obj2, p pVar, kotlin.coroutines.c frame) {
        Object objInvoke;
        Object objC = ThreadContextKt.c(eVar, obj2);
        try {
            kotlinx.coroutines.flow.internal.p pVar2 = new kotlinx.coroutines.flow.internal.p(frame, eVar);
            if (pVar instanceof BaseContinuationImpl) {
                kotlin.jvm.internal.o.d(2, pVar);
                objInvoke = pVar.invoke(obj, pVar2);
            } else {
                objInvoke = A8.p.H(pVar, obj, pVar2);
            }
            ThreadContextKt.a(eVar, objC);
            if (objInvoke == CoroutineSingletons.f43038b) {
                kotlin.jvm.internal.i.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.a(eVar, objC);
            throw th;
        }
    }

    public static final JsonDecodingException b(Number number, String key, String output) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(output, "output");
        return f(-1, "Unexpected special floating-point value " + number + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) x(output, -1)));
    }

    public static final JsonEncodingException d(String output, Number number) {
        kotlin.jvm.internal.i.e(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) x(output, -1)));
    }

    public static final JsonEncodingException e(p011ab.e eVar) {
        return new JsonEncodingException("Value of type '" + eVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException f(int i10, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        kotlin.jvm.internal.i.e(message, "message");
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException g(String message, CharSequence input, int i10) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(input, "input");
        return f(i10, message + "\nJSON input: " + ((Object) x(input, i10)));
    }

    public static int h(T7.b bVar, boolean z10) {
        int i10 = bVar.f6042b;
        int i11 = bVar.f6043c;
        int i12 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte b10 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                byte[][] bArr = bVar.f6041a;
                byte b11 = z10 ? bArr[i14][i16] : bArr[i16][i14];
                if (b11 == b10) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    i15 = 1;
                    b10 = b11;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(String str, String str2) {
        Q3.d dVar = f4722b;
        if (dVar != null) {
            dVar.E(3, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[LOOP:1: B:56:0x00a5->B:59:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[EDGE_INSN: B:82:0x00b7->B:60:0x00b7 BREAK  A[LOOP:1: B:56:0x00a5->B:59:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final InetAddress k(String str, int i10, int i11) {
        int i12;
        ?? r14;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        int i16;
        int iR;
        int i17 = 16;
        byte[] bArr = new byte[16];
        boolean z10 = false;
        int i18 = i10;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        while (true) {
            if (i18 >= i11) {
                i12 = i17;
                break;
            }
            if (i19 == i17) {
                return null;
            }
            int i22 = i18 + 2;
            if (i22 <= i11 && m.H(str, "::", i18, z10)) {
                if (i20 != -1) {
                    return null;
                }
                i19 += 2;
                if (i22 == i11) {
                    i12 = i17;
                    i20 = i19;
                    break;
                }
                i20 = i19;
                i21 = i22;
                i18 = i21;
                i15 = 0;
                while (i18 < i11) {
                    iR = p172nb.b.r(str.charAt(i18));
                    if (iR != -1) {
                        break;
                        break;
                    }
                    i15 = (i15 << 4) + iR;
                    i18++;
                }
                i16 = i18 - i21;
                if (i16 != 0) {
                }
                return null;
            }
            if (i19 != 0) {
                if (!m.H(str, ":", i18, z10)) {
                    if (m.H(str, ".", i18, z10)) {
                        int i23 = i19 - 2;
                        int i24 = i23;
                        while (i21 < i11) {
                            if (i24 != i17) {
                                if (i24 == i23) {
                                    r14 = z10;
                                    i13 = i21;
                                    while (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (kotlin.jvm.internal.i.g(cCharAt, 48) < 0 || kotlin.jvm.internal.i.g(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 != 0 || i21 == i13) && (i14 = ((r14 * 10) + cCharAt) - 48) <= 255) {
                                            i13++;
                                            r14 = i14;
                                        }
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i24] = (byte) r14;
                                        i24++;
                                        i21 = i13;
                                        i17 = 16;
                                        z10 = false;
                                    }
                                } else if (str.charAt(i21) == '.') {
                                    i21++;
                                    r14 = z10;
                                    i13 = i21;
                                    while (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (kotlin.jvm.internal.i.g(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i24] = (byte) r14;
                                        i24++;
                                        i21 = i13;
                                        i17 = 16;
                                        z10 = false;
                                    }
                                }
                            }
                        }
                        if (i24 == i19 + 2) {
                            i19 += 2;
                            i12 = 16;
                            break;
                        }
                    }
                    return null;
                }
                i18++;
            }
            i21 = i18;
            i18 = i21;
            i15 = 0;
            while (i18 < i11) {
                iR = p172nb.b.r(str.charAt(i18));
                if (iR != -1) {
                    break;
                }
                i15 = (i15 << 4) + iR;
                i18++;
            }
            i16 = i18 - i21;
            if (i16 != 0 || i16 > 4) {
                return null;
            }
            int i25 = i19 + 1;
            bArr[i19] = (byte) ((i15 >>> 8) & 255);
            i19 += 2;
            bArr[i25] = (byte) (i15 & 255);
            i17 = 16;
            z10 = false;
        }
        if (i19 != i12) {
            if (i20 == -1) {
                return null;
            }
            int i26 = i19 - i20;
            System.arraycopy(bArr, i20, bArr, 16 - i26, i26);
            Arrays.fill(bArr, i20, (16 - i19) + i20, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static void l(String str, String str2) {
        Q3.d dVar = f4722b;
        if (dVar != null) {
            dVar.E(6, str, str2);
        }
    }

    public static void m(Throwable th) {
        if (f4722b != null) {
            P8.c.b(th);
        }
    }

    public static final long n(KeyEvent keyEvent) {
        return h.a(keyEvent.getKeyCode());
    }

    public static final int o(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i10 && lineEnd != i10) {
            return lineForOffset;
        }
        if (lineStart == i10) {
            return z10 ? lineForOffset - 1 : lineForOffset;
        }
        return z10 ? lineForOffset : lineForOffset + 1;
    }

    public static final PublicKey p(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(m.G(m.G(m.G(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        kotlin.jvm.internal.i.d(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        kotlin.jvm.internal.i.d(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String q(final String kid) {
        kotlin.jvm.internal.i.e(kid, "kid");
        q qVar = q.f7852a;
        final URL url = new URL("https", kotlin.jvm.internal.i.k(q.f7868r, "www."), "/.well-known/oauth/openid/keys/");
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        q.c().execute(new Runnable() { // from class: v4.a
            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
            @Override // java.lang.Runnable
            public final void run() {
                Condition condition = conditionNewCondition;
                URL url2 = url;
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                String kid2 = kid;
                i.e(kid2, "$kid");
                ReentrantLock reentrantLock2 = reentrantLock;
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection());
                if (uRLConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        i.d(inputStream, "connection.inputStream");
                        String strE = p006a5.a.e(new BufferedReader(new InputStreamReader(inputStream, kotlin.text.a.f43120b), 8192));
                        httpURLConnection.getInputStream().close();
                        ref$ObjectRef2.element = new JSONObject(strE).optString(kid2);
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                            r rVar = r.f47939a;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    } catch (Exception e10) {
                        e10.getMessage();
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                            r rVar2 = r.f47939a;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    reentrantLock2.lock();
                    try {
                        condition.signal();
                        r rVar3 = r.f47939a;
                        throw th;
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) ref$ObjectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final int r(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static void s(String str, String str2) {
        Q3.d dVar = f4722b;
        if (dVar != null) {
            dVar.E(4, str, str2);
        }
    }

    public static final long t(long j) {
        if (j < 0) {
            int i10 = Pa.b.f4973e;
            return Pa.b.f4972d;
        }
        int i11 = Pa.b.f4973e;
        return Pa.b.f4971c;
    }

    public static final void u(z zVar, String entity) {
        kotlin.jvm.internal.i.e(entity, "entity");
        zVar.m(zVar.f44034a - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void v(z zVar) {
        u(zVar, "object");
        throw null;
    }

    public static final boolean w(InterfaceC1084f interfaceC1084f) {
        return (((Configuration) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a)).uiMode & 48) == 32;
    }

    public static final CharSequence x(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        String str = i11 <= 0 ? "" : ".....";
        String str2 = i12 >= charSequence.length() ? "" : ".....";
        StringBuilder sbE = C4.b.e(str);
        if (i11 < 0) {
            i11 = 0;
        }
        int length2 = charSequence.length();
        if (i12 > length2) {
            i12 = length2;
        }
        sbE.append(charSequence.subSequence(i11, i12).toString());
        sbE.append(str2);
        return sbE.toString();
    }

    public static final long y(long j, long j10, DurationUnit unit) {
        long jG;
        kotlin.jvm.internal.i.e(unit, "unit");
        long jI = Pa.b.i(j10, unit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (!Pa.b.e(j10) || (j ^ jI) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        if (((jI - 1) | 1) != Long.MAX_VALUE) {
            long j11 = j + jI;
            if (((jI ^ j11) & (j ^ j11)) < 0) {
                return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            return j11;
        }
        if ((((int) j10) & 1) == 0) {
            jG = C1787c0.i((j10 >> 1) / ((long) 2));
        } else if (Pa.b.e(j10)) {
            jG = Pa.b.h(Integer.signum(2), j10);
        } else {
            long j12 = j10 >> 1;
            long j13 = 2;
            long j14 = j12 / j13;
            if (-4611686018426L > j14 || j14 >= 4611686018427L) {
                jG = C1787c0.g(j14);
            } else {
                long j15 = 1000000;
                jG = C1787c0.i((j14 * j15) + (((j12 - (j14 * j13)) * j15) / j13));
            }
        }
        long jI2 = Pa.b.i(jG, unit);
        return (1 | (jI2 - 1)) == Long.MAX_VALUE ? jI2 : y(y(j, jG, unit), Pa.b.g(j10, Pa.b.k(jG)), unit);
    }

    public static final long z(long j, long j10, DurationUnit durationUnit) {
        long j11 = j - j10;
        if (((j11 ^ j) & (~(j11 ^ j10))) >= 0) {
            return C1787c0.u(j11, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Pa.b.k(t(j11));
        }
        long jD = Lb.a.d(1L, durationUnit2, durationUnit);
        long j12 = (j / jD) - (j10 / jD);
        long j13 = (j % jD) - (j10 % jD);
        int i10 = Pa.b.f4973e;
        return Pa.b.g(C1787c0.u(j12, durationUnit2), C1787c0.u(j13, durationUnit));
    }

    @Override // com.google.android.play.integrity.internal.m
    public /* synthetic */ Object a() {
        return new v("StandardIntegrity");
    }

    @Override // n4.s.a
    public void c(FacebookException facebookException) {
        Log.e("y", kotlin.jvm.internal.i.k(facebookException, "Got unexpected exception: "));
    }

    @Override // n4.s.a
    public void a(JSONObject jSONObject) {
        String strOptString = jSONObject == null ? null : jSONObject.optString("id");
        if (strOptString == null) {
            return;
        }
        String strOptString2 = jSONObject.optString(ActionType.LINK);
        String strOptString3 = jSONObject.optString("profile_picture", null);
        A.f7741d.a().a(new y(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }
}
