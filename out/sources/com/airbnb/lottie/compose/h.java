package com.airbnb.lottie.compose;

import A8.p;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.voltasit.obdeleven.R;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.N;
import p079g3.j;
import p079g3.s;
import p214r3.c;
import p293xa.r;
import p318zb.A;
import p318zb.C;
import p318zb.v;
import zb.C.a;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(Context context, d dVar, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws FileNotFoundException {
        RememberLottieCompositionKt$lottieComposition$1 rememberLottieCompositionKt$lottieComposition$1;
        String str5;
        String str6;
        String str7;
        Object objF;
        Context context2;
        p079g3.b bVar;
        Object objF2;
        Context context3 = context;
        if (continuationImpl instanceof RememberLottieCompositionKt$lottieComposition$1) {
            rememberLottieCompositionKt$lottieComposition$1 = (RememberLottieCompositionKt$lottieComposition$1) continuationImpl;
            int i10 = rememberLottieCompositionKt$lottieComposition$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rememberLottieCompositionKt$lottieComposition$1.label = i10 - Integer.MIN_VALUE;
            } else {
                rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(continuationImpl);
            }
        } else {
            rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(continuationImpl);
        }
        Object objP = rememberLottieCompositionKt$lottieComposition$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = rememberLottieCompositionKt$lottieComposition$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                String str8 = (String) rememberLottieCompositionKt$lottieComposition$1.L$3;
                String str9 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                String str10 = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                Context context4 = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                kotlin.b.b(objP);
                str7 = str8;
                context3 = context4;
                str6 = str9;
                str5 = str10;
            } else if (i11 == 2) {
                bVar = (p079g3.b) rememberLottieCompositionKt$lottieComposition$1.L$3;
                String str11 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                str6 = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                context2 = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                kotlin.b.b(objP);
                str7 = str11;
                rememberLottieCompositionKt$lottieComposition$1.L$0 = bVar;
                rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                rememberLottieCompositionKt$lottieComposition$1.label = 3;
                if (!bVar.f35556e.isEmpty() || (objF2 = C2680e.f(N.f43200c, new RememberLottieCompositionKt$loadFontsFromAssets$2(bVar, context2, str6, str7, null), rememberLottieCompositionKt$lottieComposition$1)) != coroutineSingletons) {
                }
                if (objF2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (p079g3.b) rememberLottieCompositionKt$lottieComposition$1.L$0;
                kotlin.b.b(objP);
            }
            return bVar;
        }
        kotlin.b.b(objP);
        s<p079g3.b> sVarB = b(context, dVar, str4, false);
        if (sVarB == null) {
            throw new IllegalArgumentException(("Unable to create parsing task for " + dVar + '.').toString());
        }
        rememberLottieCompositionKt$lottieComposition$1.L$0 = context3;
        str5 = str;
        rememberLottieCompositionKt$lottieComposition$1.L$1 = str5;
        str6 = str2;
        rememberLottieCompositionKt$lottieComposition$1.L$2 = str6;
        str7 = str3;
        rememberLottieCompositionKt$lottieComposition$1.L$3 = str7;
        rememberLottieCompositionKt$lottieComposition$1.label = 1;
        C2693i c2693i = new C2693i(1, p.y(rememberLottieCompositionKt$lottieComposition$1));
        c2693i.s();
        sVarB.b(new f(c2693i));
        sVarB.a(new g(c2693i));
        objP = c2693i.p();
        if (objP == coroutineSingletons) {
            return coroutineSingletons;
        }
        p079g3.b bVar2 = (p079g3.b) objP;
        rememberLottieCompositionKt$lottieComposition$1.L$0 = context3;
        rememberLottieCompositionKt$lottieComposition$1.L$1 = str6;
        rememberLottieCompositionKt$lottieComposition$1.L$2 = str7;
        rememberLottieCompositionKt$lottieComposition$1.L$3 = bVar2;
        rememberLottieCompositionKt$lottieComposition$1.label = 2;
        if (bVar2.f35555d.isEmpty() || (objF = C2680e.f(N.f43200c, new RememberLottieCompositionKt$loadImagesFromAssets$2(bVar2, context3, str5, null), rememberLottieCompositionKt$lottieComposition$1)) != coroutineSingletons) {
            objF = r.f47939a;
        }
        if (objF == coroutineSingletons) {
            return coroutineSingletons;
        }
        context2 = context3;
        bVar = bVar2;
        rememberLottieCompositionKt$lottieComposition$1.L$0 = bVar;
        rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
        rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
        rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
        rememberLottieCompositionKt$lottieComposition$1.label = 3;
        objF2 = !bVar.f35556e.isEmpty() ? r.f47939a : r.f47939a;
        if (objF2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        return bVar;
    }

    public static final s<p079g3.b> b(Context context, d dVar, final String str, boolean z10) throws FileNotFoundException {
        int i10 = 0;
        int i11 = 1;
        if (dVar instanceof d.e) {
            if (!i.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((d.e) dVar).getClass();
                HashMap map = j.f35577a;
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                return j.a(str, new Callable() { // from class: g3.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Boolean bool;
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        try {
                            C cB = v.b(v.g(context2.getResources().openRawResource(R.raw.spinner_white)));
                            try {
                                C cB2 = v.b(new A(cB));
                                byte[] bArr = j.f35579c;
                                int length = bArr.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        cB2.close();
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    if (cB2.readByte() != bArr[i12]) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                    i12++;
                                }
                            } catch (Exception unused) {
                                c.f46317a.getClass();
                                bool = Boolean.FALSE;
                            } catch (NoSuchMethodError unused2) {
                                bool = Boolean.FALSE;
                            }
                            boolean zBooleanValue = bool.booleanValue();
                            String str2 = str;
                            return zBooleanValue ? j.d(context2, new ZipInputStream(cB.new a()), str2) : j.b(cB.new a(), str2);
                        } catch (Resources.NotFoundException e10) {
                            return new r((Throwable) e10);
                        }
                    }
                }, null);
            }
            ((d.e) dVar).getClass();
            HashMap map2 = j.f35577a;
            StringBuilder sb2 = new StringBuilder("rawRes");
            sb2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
            sb2.append(R.raw.spinner_white);
            final String string = sb2.toString();
            final WeakReference weakReference2 = new WeakReference(context);
            final Context applicationContext2 = context.getApplicationContext();
            return j.a(string, new Callable() { // from class: g3.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean bool;
                    Context context2 = (Context) weakReference2.get();
                    if (context2 == null) {
                        context2 = applicationContext2;
                    }
                    try {
                        C cB = v.b(v.g(context2.getResources().openRawResource(R.raw.spinner_white)));
                        try {
                            C cB2 = v.b(new A(cB));
                            byte[] bArr = j.f35579c;
                            int length = bArr.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length) {
                                    cB2.close();
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                if (cB2.readByte() != bArr[i12]) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                i12++;
                            }
                        } catch (Exception unused) {
                            c.f46317a.getClass();
                            bool = Boolean.FALSE;
                        } catch (NoSuchMethodError unused2) {
                            bool = Boolean.FALSE;
                        }
                        boolean zBooleanValue = bool.booleanValue();
                        String str2 = string;
                        return zBooleanValue ? j.d(context2, new ZipInputStream(cB.new a()), str2) : j.b(cB.new a(), str2);
                    } catch (Resources.NotFoundException e10) {
                        return new r((Throwable) e10);
                    }
                }
            }, null);
        }
        if (dVar instanceof d.f) {
            if (i.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((d.f) dVar).getClass();
                return j.a("url_null", new D7.c(context, i11, "url_null"), null);
            }
            ((d.f) dVar).getClass();
            return j.a(str, new D7.c(context, i11, str), null);
        }
        if (dVar instanceof d.c) {
            if (z10) {
                return null;
            }
            ((d.c) dVar).getClass();
            new FileInputStream((String) null);
            m.C(null, "zip", false);
            throw null;
        }
        if (dVar instanceof d.a) {
            if (!i.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((d.a) dVar).getClass();
                HashMap map3 = j.f35577a;
                final Context applicationContext3 = context.getApplicationContext();
                return j.a(str, new Callable(applicationContext3, str) { // from class: g3.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        throw null;
                    }
                }, null);
            }
            ((d.a) dVar).getClass();
            HashMap map4 = j.f35577a;
            final Context applicationContext4 = context.getApplicationContext();
            final String str2 = "asset_null";
            return j.a("asset_null", new Callable(applicationContext4, str2) { // from class: g3.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    throw null;
                }
            }, null);
        }
        if (dVar instanceof d.C0243d) {
            if (i.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((d.C0243d) dVar).getClass();
                throw null;
            }
            ((d.C0243d) dVar).getClass();
            return j.a(str, new p079g3.d(), null);
        }
        if (!(dVar instanceof d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ContentResolver contentResolver = context.getContentResolver();
        ((d.b) dVar).getClass();
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(null);
        if (i.a(str, "__LottieInternalDefaultCacheKey__")) {
            throw null;
        }
        return j.a(str, new p079g3.c(inputStreamOpenInputStream, i10, str), new R0.j(2, inputStreamOpenInputStream));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LottieCompositionResultImpl c(d.e eVar, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.e(-1248473602);
        RememberLottieCompositionKt$rememberLottieComposition$1 rememberLottieCompositionKt$rememberLottieComposition$1 = new RememberLottieCompositionKt$rememberLottieComposition$1(3, null);
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        interfaceC1084f.e(1157296644);
        boolean zK = interfaceC1084f.K(eVar);
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (zK || objF == c0153a) {
            objF = J0.f(new LottieCompositionResultImpl());
            interfaceC1084f.E(objF);
        }
        interfaceC1084f.I();
        X x10 = (X) objF;
        interfaceC1084f.e(511388516);
        boolean zK2 = interfaceC1084f.K(eVar) | interfaceC1084f.K("__LottieInternalDefaultCacheKey__");
        Object objF2 = interfaceC1084f.f();
        if (zK2 || objF2 == c0153a) {
            interfaceC1084f.E(b(context, eVar, "__LottieInternalDefaultCacheKey__", true));
        }
        interfaceC1084f.I();
        E.e(eVar, "__LottieInternalDefaultCacheKey__", new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, eVar, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", x10, null), interfaceC1084f);
        LottieCompositionResultImpl lottieCompositionResultImpl = (LottieCompositionResultImpl) x10.getValue();
        interfaceC1084f.I();
        return lottieCompositionResultImpl;
    }
}
