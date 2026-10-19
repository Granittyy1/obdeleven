package androidx.compose.ui.contentcapture;

import C4.v;
import Ia.l;
import Ia.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.AbstractC0883k;
import androidx.collection.B;
import androidx.collection.C0884l;
import androidx.collection.K;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.I0;
import androidx.compose.ui.platform.J0;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.k;
import androidx.compose.ui.semantics.q;
import androidx.compose.ui.text.A;
import androidx.compose.ui.text.C1260a;
import androidx.lifecycle.InterfaceC1363f;
import androidx.lifecycle.InterfaceC1376t;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.channels.BufferedChannel;
import p013b0.n;
import p293xa.r;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManager implements InterfaceC1363f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f13307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.a<? extends T.b> f13308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T.b f13309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13310e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13311f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TranslateStatus f13312g = TranslateStatus.f13321b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13313h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BufferedChannel f13314i = kotlinx.coroutines.channels.g.a(1, 6, null);
    public final Handler j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B f13315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B<I0> f13317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I0 f13318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.compose.ui.contentcapture.a f13320p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    public static final class TranslateStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TranslateStatus f13321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TranslateStatus f13322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TranslateStatus[] f13323d;

        static {
            TranslateStatus translateStatus = new TranslateStatus("SHOW_ORIGINAL", 0);
            f13321b = translateStatus;
            TranslateStatus translateStatus2 = new TranslateStatus("SHOW_TRANSLATED", 1);
            f13322c = translateStatus2;
            TranslateStatus[] translateStatusArr = {translateStatus, translateStatus2};
            f13323d = translateStatusArr;
            kotlin.enums.a.a(translateStatusArr);
        }

        public TranslateStatus() {
            throw null;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) f13323d.clone();
        }
    }

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    public static final class a {
        public static void a(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            J0 j0B;
            q qVar;
            l lVar;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jKeyAt = longSparseArray.keyAt(i10);
                ViewTranslationResponse viewTranslationResponseB = e.b(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseB != null && (value = viewTranslationResponseB.getValue("android:text")) != null && (text = value.getText()) != null && (j0B = androidContentCaptureManager.e().b((int) jKeyAt)) != null && (qVar = j0B.f14934a) != null) {
                    androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar.f15242d, k.f15218k);
                    if (aVar != null && (lVar = (l) aVar.f15191b) != null) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.a] */
    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Ia.a<? extends T.b> aVar) {
        this.f13307b = androidComposeView;
        this.f13308c = aVar;
        B b10 = C0884l.f9191a;
        kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f13315k = b10;
        this.f13317m = new B<>();
        q qVarA = androidComposeView.getSemanticsOwner().a();
        kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f13318n = new I0(qVarA, b10);
        this.f13320p = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
            /* JADX WARN: Code duplicated, block: B:130:0x008c A[EDGE_INSN: B:130:0x008c->B:22:0x008c BREAK  A[LOOP:0: B:8:0x0026->B:21:0x0081], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:20:0x007f A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0081 A[LOOP:0: B:8:0x0026->B:21:0x0081, LOOP_END] */
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView2;
                B<I0> b11;
                B<I0> b12;
                B<I0> b13;
                AbstractC0883k<J0> abstractC0883k;
                int[] iArr;
                long[] jArr;
                int i10;
                AndroidComposeView androidComposeView3;
                B<I0> b14;
                AbstractC0883k<J0> abstractC0883k2;
                int[] iArr2;
                long[] jArr2;
                int i11;
                int i12;
                long[] jArr3;
                Object[] objArr;
                long[] jArr4;
                Object[] objArr2;
                long[] jArr5;
                Object[] objArr3;
                long[] jArr6;
                Object[] objArr4;
                AndroidContentCaptureManager androidContentCaptureManager = this.f13327b;
                if (androidContentCaptureManager.f()) {
                    AndroidComposeView androidComposeView4 = androidContentCaptureManager.f13307b;
                    androidComposeView4.C(true);
                    B<I0> b15 = androidContentCaptureManager.f13317m;
                    int[] iArr3 = b15.f9187b;
                    long[] jArr7 = b15.f9186a;
                    int length = jArr7.length - 2;
                    int i13 = 8;
                    long j = -9187201950435737472L;
                    char c10 = 7;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr7[i14];
                            if ((((~j10) << c10) & j10 & j) == j) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                                i13 = 8;
                                j = -9187201950435737472L;
                                c10 = 7;
                            } else {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j10 & 255) < 128) {
                                        int i17 = iArr3[(i14 << 3) + i16];
                                        if (!androidContentCaptureManager.e().a(i17)) {
                                            androidContentCaptureManager.f13310e.add(new j(i17, androidContentCaptureManager.f13316l, ContentCaptureEventType.f13325c, null));
                                            androidContentCaptureManager.f13314i.n(r.f47939a);
                                        }
                                        i13 = 8;
                                    }
                                    j10 >>= i13;
                                }
                                if (i15 != i13) {
                                    break;
                                }
                                if (i14 != length) {
                                    break;
                                }
                                i14++;
                                i13 = 8;
                                j = -9187201950435737472L;
                                c10 = 7;
                            }
                        }
                    }
                    androidContentCaptureManager.m(androidComposeView4.getSemanticsOwner().a(), androidContentCaptureManager.f13318n);
                    AbstractC0883k<J0> abstractC0883kE = androidContentCaptureManager.e();
                    int[] iArr4 = abstractC0883kE.f9187b;
                    long[] jArr8 = abstractC0883kE.f9186a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j11 = jArr8[i18];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                int i20 = 0;
                                while (i20 < i19) {
                                    if ((j11 & 255) < 128) {
                                        int i21 = iArr4[(i18 << 3) + i20];
                                        I0 i0B = b15.b(i21);
                                        J0 j0B = abstractC0883kE.b(i21);
                                        q qVar = j0B != null ? j0B.f14934a : null;
                                        if (qVar == null) {
                                            throw v.g("no value for specified key");
                                        }
                                        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
                                        int i22 = qVar.f15245g;
                                        K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVar.f15234b;
                                        if (i0B == null) {
                                            Object[] objArr5 = k10.f9128b;
                                            long[] jArr9 = k10.f9127a;
                                            abstractC0883k2 = abstractC0883kE;
                                            int length3 = jArr9.length - 2;
                                            androidComposeView3 = androidComposeView4;
                                            b14 = b15;
                                            iArr2 = iArr4;
                                            if (length3 >= 0) {
                                                int i23 = 0;
                                                while (true) {
                                                    long j12 = jArr9[i23];
                                                    jArr2 = jArr8;
                                                    i11 = length2;
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j12 & 255) < 128) {
                                                                jArr6 = jArr9;
                                                                androidx.compose.ui.semantics.v vVar = (androidx.compose.ui.semantics.v) objArr5[(i23 << 3) + i25];
                                                                objArr4 = objArr5;
                                                                androidx.compose.ui.semantics.v<List<C1260a>> vVar2 = SemanticsProperties.f15172z;
                                                                if (kotlin.jvm.internal.i.a(vVar, vVar2)) {
                                                                    List list = (List) SemanticsConfigurationKt.a(lVar, vVar2);
                                                                    androidContentCaptureManager.n(i22, String.valueOf(list != null ? (C1260a) kotlin.collections.q.P(list) : null));
                                                                }
                                                            } else {
                                                                jArr6 = jArr9;
                                                                objArr4 = objArr5;
                                                            }
                                                            j12 >>= 8;
                                                            i25++;
                                                            objArr5 = objArr4;
                                                            jArr9 = jArr6;
                                                        }
                                                        jArr5 = jArr9;
                                                        objArr3 = objArr5;
                                                        if (i24 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr5 = jArr9;
                                                        objArr3 = objArr5;
                                                    }
                                                    if (i23 == length3) {
                                                        break;
                                                    }
                                                    i23++;
                                                    jArr8 = jArr2;
                                                    length2 = i11;
                                                    objArr5 = objArr3;
                                                    jArr9 = jArr5;
                                                }
                                            } else {
                                                jArr2 = jArr8;
                                                i11 = length2;
                                            }
                                        } else {
                                            androidComposeView3 = androidComposeView4;
                                            b14 = b15;
                                            abstractC0883k2 = abstractC0883kE;
                                            iArr2 = iArr4;
                                            jArr2 = jArr8;
                                            i11 = length2;
                                            Object[] objArr6 = k10.f9128b;
                                            long[] jArr10 = k10.f9127a;
                                            int length4 = jArr10.length - 2;
                                            if (length4 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    long j13 = jArr10[i26];
                                                    i12 = i18;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i27 = 8 - ((~(i26 - length4)) >>> 31);
                                                        int i28 = 0;
                                                        while (i28 < i27) {
                                                            if ((j13 & 255) < 128) {
                                                                jArr4 = jArr10;
                                                                androidx.compose.ui.semantics.v vVar3 = (androidx.compose.ui.semantics.v) objArr6[(i26 << 3) + i28];
                                                                objArr2 = objArr6;
                                                                androidx.compose.ui.semantics.v<List<C1260a>> vVar4 = SemanticsProperties.f15172z;
                                                                if (kotlin.jvm.internal.i.a(vVar3, vVar4)) {
                                                                    List list2 = (List) SemanticsConfigurationKt.a(i0B.f14927a, vVar4);
                                                                    C1260a c1260a = list2 != null ? (C1260a) kotlin.collections.q.P(list2) : null;
                                                                    List list3 = (List) SemanticsConfigurationKt.a(lVar, vVar4);
                                                                    C1260a c1260a2 = list3 != null ? (C1260a) kotlin.collections.q.P(list3) : null;
                                                                    if (!kotlin.jvm.internal.i.a(c1260a, c1260a2)) {
                                                                        androidContentCaptureManager.n(i22, String.valueOf(c1260a2));
                                                                    }
                                                                }
                                                            } else {
                                                                jArr4 = jArr10;
                                                                objArr2 = objArr6;
                                                            }
                                                            j13 >>= 8;
                                                            i28++;
                                                            objArr6 = objArr2;
                                                            jArr10 = jArr4;
                                                        }
                                                        jArr3 = jArr10;
                                                        objArr = objArr6;
                                                        if (i27 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr3 = jArr10;
                                                        objArr = objArr6;
                                                    }
                                                    if (i26 == length4) {
                                                        break;
                                                    }
                                                    i26++;
                                                    i18 = i12;
                                                    objArr6 = objArr;
                                                    jArr10 = jArr3;
                                                }
                                            }
                                            j11 >>= 8;
                                            i20++;
                                            abstractC0883kE = abstractC0883k2;
                                            iArr4 = iArr2;
                                            androidComposeView4 = androidComposeView3;
                                            b15 = b14;
                                            jArr8 = jArr2;
                                            length2 = i11;
                                            i18 = i12;
                                        }
                                    } else {
                                        androidComposeView3 = androidComposeView4;
                                        b14 = b15;
                                        abstractC0883k2 = abstractC0883kE;
                                        iArr2 = iArr4;
                                        jArr2 = jArr8;
                                        i11 = length2;
                                    }
                                    i12 = i18;
                                    j11 >>= 8;
                                    i20++;
                                    abstractC0883kE = abstractC0883k2;
                                    iArr4 = iArr2;
                                    androidComposeView4 = androidComposeView3;
                                    b15 = b14;
                                    jArr8 = jArr2;
                                    length2 = i11;
                                    i18 = i12;
                                }
                                androidComposeView2 = androidComposeView4;
                                b11 = b15;
                                abstractC0883k = abstractC0883kE;
                                iArr = iArr4;
                                jArr = jArr8;
                                int i29 = length2;
                                int i30 = i18;
                                if (i19 != 8) {
                                    break;
                                }
                                length2 = i29;
                                i10 = i30;
                            } else {
                                androidComposeView2 = androidComposeView4;
                                b11 = b15;
                                abstractC0883k = abstractC0883kE;
                                iArr = iArr4;
                                jArr = jArr8;
                                i10 = i18;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i18 = i10 + 1;
                            abstractC0883kE = abstractC0883k;
                            iArr4 = iArr;
                            androidComposeView4 = androidComposeView2;
                            b15 = b11;
                            jArr8 = jArr;
                        }
                    } else {
                        androidComposeView2 = androidComposeView4;
                        b11 = b15;
                    }
                    b11.c();
                    AbstractC0883k<J0> abstractC0883kE2 = androidContentCaptureManager.e();
                    int[] iArr5 = abstractC0883kE2.f9187b;
                    Object[] objArr7 = abstractC0883kE2.f9188c;
                    long[] jArr11 = abstractC0883kE2.f9186a;
                    int length5 = jArr11.length - 2;
                    if (length5 >= 0) {
                        int i31 = 0;
                        while (true) {
                            long j14 = jArr11[i31];
                            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                int i33 = 0;
                                while (i33 < i32) {
                                    if ((j14 & 255) < 128) {
                                        int i34 = (i31 << 3) + i33;
                                        b13 = b11;
                                        b13.h(iArr5[i34], new I0(((J0) objArr7[i34]).f14934a, androidContentCaptureManager.e()));
                                    } else {
                                        b13 = b11;
                                    }
                                    j14 >>= 8;
                                    i33++;
                                    b11 = b13;
                                }
                                b12 = b11;
                                if (i32 != 8) {
                                    break;
                                }
                            } else {
                                b12 = b11;
                            }
                            if (i31 == length5) {
                                break;
                            }
                            i31++;
                            b11 = b12;
                        }
                    }
                    androidContentCaptureManager.f13318n = new I0(androidComposeView2.getSemanticsOwner().a(), androidContentCaptureManager.e());
                    androidContentCaptureManager.f13319o = false;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.f) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.b.b(r10)
        L31:
            r10 = r5
            goto L55
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.f) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.b.b(r10)
            goto L65
        L47:
            kotlin.b.b(r10)
            kotlinx.coroutines.channels.BufferedChannel r10 = r9.f13314i
            r10.getClass()
            kotlinx.coroutines.channels.BufferedChannel$a r2 = new kotlinx.coroutines.channels.BufferedChannel$a
            r2.<init>()
            r10 = r9
        L55:
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r5 = r2.a(r0)
            if (r5 != r1) goto L62
            return r1
        L62:
            r8 = r5
            r5 = r10
            r10 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L95
            r2.next()
            boolean r10 = r5.f()
            if (r10 == 0) goto L79
            r5.g()
        L79:
            boolean r10 = r5.f13319o
            if (r10 != 0) goto L86
            r5.f13319o = r4
            android.os.Handler r10 = r5.j
            androidx.compose.ui.contentcapture.a r6 = r5.f13320p
            r10.post(r6)
        L86:
            r0.L$0 = r5
            r0.L$1 = r2
            r0.label = r3
            long r6 = r5.f13311f
            java.lang.Object r10 = kotlinx.coroutines.I.b(r6, r0)
            if (r10 != r1) goto L31
            return r1
        L95:
            xa.r r10 = p293xa.r.f47939a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d(q qVar, p<? super Integer, ? super q, r> pVar) {
        qVar.getClass();
        List listH = q.h(qVar, true, 4);
        int size = listH.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listH.get(i11);
            if (e().a(((q) obj).f15245g)) {
                pVar.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    public final AbstractC0883k<J0> e() {
        if (this.f13313h) {
            this.f13313h = false;
            this.f13315k = K0.b(this.f13307b.getSemanticsOwner());
            this.f13316l = System.currentTimeMillis();
        }
        return this.f13315k;
    }

    public final boolean f() {
        return this.f13309d != null;
    }

    public final void g() {
        Object obj;
        AutofillId autofillIdA;
        T.b bVar = this.f13309d;
        if (bVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f13310e;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                obj = bVar.f5728a;
                if (i10 >= size) {
                    break;
                }
                j jVar = (j) arrayList.get(i10);
                int iOrdinal = jVar.f13333c.ordinal();
                if (iOrdinal == 0) {
                    T.e eVar = jVar.f13334d;
                    if (eVar != null && Build.VERSION.SDK_INT >= 29) {
                        T.b.a.c(T.a.b(obj), eVar.f5730a);
                    }
                } else if (iOrdinal == 1 && (autofillIdA = bVar.a(jVar.f13331a)) != null && Build.VERSION.SDK_INT >= 29) {
                    T.b.a.d(T.a.b(obj), autofillIdA);
                }
                i10++;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                T.b.a.f(T.a.b(obj), bVar.f5729b.getAutofillId(), new long[]{Long.MIN_VALUE});
            }
            arrayList.clear();
        }
    }

    public final void j() {
        androidx.compose.ui.semantics.a aVar;
        Ia.a aVar2;
        this.f13312g = TranslateStatus.f13321b;
        AbstractC0883k<J0> abstractC0883kE = e();
        Object[] objArr = abstractC0883kE.f9188c;
        long[] jArr = abstractC0883kE.f9186a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.l lVar = ((J0) objArr[(i10 << 3) + i12]).f14934a.f15242d;
                        if (SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15136B) != null && (aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, k.f15220m)) != null && (aVar2 = (Ia.a) aVar.f15191b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void k() {
        androidx.compose.ui.semantics.a aVar;
        l lVar;
        this.f13312g = TranslateStatus.f13321b;
        AbstractC0883k<J0> abstractC0883kE = e();
        Object[] objArr = abstractC0883kE.f9188c;
        long[] jArr = abstractC0883kE.f9186a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.l lVar2 = ((J0) objArr[(i10 << 3) + i12]).f14934a.f15242d;
                        if (kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar2, SemanticsProperties.f15136B), Boolean.TRUE) && (aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar2, k.f15219l)) != null && (lVar = (l) aVar.f15191b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void l() {
        androidx.compose.ui.semantics.a aVar;
        l lVar;
        this.f13312g = TranslateStatus.f13322c;
        AbstractC0883k<J0> abstractC0883kE = e();
        Object[] objArr = abstractC0883kE.f9188c;
        long[] jArr = abstractC0883kE.f9186a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.l lVar2 = ((J0) objArr[(i10 << 3) + i12]).f14934a.f15242d;
                        if (kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar2, SemanticsProperties.f15136B), Boolean.FALSE) && (aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar2, k.f15219l)) != null && (lVar = (l) aVar.f15191b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void m(q qVar, final I0 i10) {
        d(qVar, new p<Integer, q, r>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(Integer num, q qVar2) {
                int iIntValue = num.intValue();
                q qVar3 = qVar2;
                if (!i10.f14928b.a(qVar3.f15245g)) {
                    this.o(iIntValue, qVar3);
                    this.f13314i.n(r.f47939a);
                }
                return r.f47939a;
            }
        });
        List listH = q.h(qVar, true, 4);
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar2 = (q) listH.get(i11);
            if (e().a(qVar2.f15245g)) {
                B<I0> b10 = this.f13317m;
                int i12 = qVar2.f15245g;
                if (b10.a(i12)) {
                    I0 i0B = b10.b(i12);
                    if (i0B == null) {
                        throw v.g("node not present in pruned tree before this change");
                    }
                    m(qVar2, i0B);
                } else {
                    continue;
                }
            }
        }
    }

    public final void n(int i10, String str) {
        T.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (bVar = this.f13309d) != null) {
            AutofillId autofillIdA = bVar.a(i10);
            if (autofillIdA == null) {
                throw v.g("Invalid content capture ID");
            }
            if (i11 >= 29) {
                T.b.a.e(T.a.b(bVar.f5728a), autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    public final void o(int i10, q qVar) {
        androidx.compose.ui.semantics.a aVar;
        l lVar;
        int i11;
        T.e eVar;
        NodeCoordinator nodeCoordinatorC;
        String strH;
        l lVar2;
        if (f()) {
            androidx.compose.ui.semantics.l lVar3 = qVar.f15242d;
            Boolean bool = (Boolean) SemanticsConfigurationKt.a(lVar3, SemanticsProperties.f15136B);
            if (this.f13312g == TranslateStatus.f13321b && kotlin.jvm.internal.i.a(bool, Boolean.TRUE)) {
                androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar3, k.f15219l);
                if (aVar2 != null && (lVar2 = (l) aVar2.f15191b) != null) {
                }
            } else if (this.f13312g == TranslateStatus.f13322c && kotlin.jvm.internal.i.a(bool, Boolean.FALSE) && (aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar3, k.f15219l)) != null && (lVar = (l) aVar.f15191b) != null) {
            }
            T.b bVar = this.f13309d;
            if (bVar != null && (i11 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f13307b.getAutofillId();
                q qVarJ = qVar.j();
                if (qVarJ == null || (autofillId = bVar.a(qVarJ.f15245g)) != null) {
                    int i12 = qVar.f15245g;
                    T.e eVar2 = i11 >= 29 ? new T.e(T.b.a.b(T.a.b(bVar.f5728a), autofillId, i12)) : null;
                    if (eVar2 == null) {
                        eVar = null;
                    } else {
                        androidx.compose.ui.semantics.v<r> vVar = SemanticsProperties.f15143I;
                        androidx.compose.ui.semantics.l lVar4 = qVar.f15242d;
                        if (lVar4.f15234b.b(vVar)) {
                            eVar = null;
                        } else {
                            ViewStructure viewStructure = eVar2.f5730a;
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f13316l);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
                            }
                            String str = (String) SemanticsConfigurationKt.a(lVar4, SemanticsProperties.f15170x);
                            if (str != null) {
                                viewStructure.setId(i12, null, null, str);
                            }
                            if (((Boolean) SemanticsConfigurationKt.a(lVar4, SemanticsProperties.f15159m)) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            List list = (List) SemanticsConfigurationKt.a(lVar4, SemanticsProperties.f15172z);
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(p039d0.a.b(list, "\n", null, 62));
                            }
                            C1260a c1260a = (C1260a) SemanticsConfigurationKt.a(lVar4, SemanticsProperties.f15138D);
                            if (c1260a != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(c1260a);
                            }
                            List list2 = (List) SemanticsConfigurationKt.a(lVar4, SemanticsProperties.f15148a);
                            if (list2 != null) {
                                viewStructure.setContentDescription(p039d0.a.b(list2, "\n", null, 62));
                            }
                            androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(lVar4, SemanticsProperties.f15169w);
                            if (iVar != null && (strH = K0.h(iVar.f15203a)) != null) {
                                viewStructure.setClassName(strH);
                            }
                            androidx.compose.ui.text.B bD = K0.d(lVar4);
                            if (bD != null) {
                                A a10 = bD.f15300a;
                                float fC = n.c(a10.f15277b.f15318a.f15691b);
                                p013b0.c cVar = a10.f15282g;
                                viewStructure.setTextStyle(cVar.P0() * cVar.getDensity() * fC, 0, 0, 0);
                            }
                            q qVarJ2 = qVar.j();
                            I.f fVarH = I.f.f3756e;
                            if (qVarJ2 != null && (nodeCoordinatorC = qVar.c()) != null) {
                                NodeCoordinator nodeCoordinator = nodeCoordinatorC.v1().f13997o ? nodeCoordinatorC : null;
                                if (nodeCoordinator != null) {
                                    fVarH = C1185f.d(qVarJ2.f15239a, 8).H(nodeCoordinator, true);
                                }
                            }
                            float f10 = fVarH.f3757a;
                            float f11 = fVarH.f3758b;
                            viewStructure.setDimens((int) f10, (int) f11, 0, 0, (int) (fVarH.f3759c - f10), (int) (fVarH.f3760d - f11));
                            eVar = eVar2;
                        }
                    }
                } else {
                    eVar = null;
                }
            } else {
                eVar = null;
            }
            if (eVar != null) {
                this.f13310e.add(new j(qVar.f15245g, this.f13316l, ContentCaptureEventType.f13324b, eVar));
            }
            d(qVar, new p<Integer, q, r>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(Integer num, q qVar2) {
                    this.this$0.o(num.intValue(), qVar2);
                    return r.f47939a;
                }
            });
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j.removeCallbacks(this.f13320p);
        this.f13309d = null;
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void p(InterfaceC1376t interfaceC1376t) {
        q(this.f13307b.getSemanticsOwner().a());
        g();
        this.f13309d = null;
    }

    public final void q(q qVar) {
        if (f()) {
            this.f13310e.add(new j(qVar.f15245g, this.f13316l, ContentCaptureEventType.f13325c, null));
            List listH = q.h(qVar, true, 4);
            int size = listH.size();
            for (int i10 = 0; i10 < size; i10++) {
                q((q) listH.get(i10));
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void x(InterfaceC1376t interfaceC1376t) {
        this.f13309d = this.f13308c.invoke();
        o(-1, this.f13307b.getSemanticsOwner().a());
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
