package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.speech.SpeechRecognizer;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.ui.component.PulsatingBoxKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Pair;

/* JADX INFO: compiled from: VoiceInputLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VoiceInputLayoutKt {
    /* JADX INFO: renamed from: IconWithPulsatingBox-DZNDmhg, reason: not valid java name */
    private static final void m205IconWithPulsatingBoxDZNDmhg(final androidx.compose.ui.h hVar, final SpeechRecognizerState speechRecognizerState, boolean z10, final Ia.a<p293xa.r> aVar, final long j, final long j10, final long j11, final long j12, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(764086828);
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        Pair pair = speechRecognizerState.isListening() ? new Pair(new androidx.compose.ui.graphics.H(j12), new androidx.compose.ui.graphics.H(j10)) : new Pair(new androidx.compose.ui.graphics.H(j11), new androidx.compose.ui.graphics.H(j));
        final boolean z12 = z11;
        long j13 = ((androidx.compose.ui.graphics.H) pair.a()).f13506a;
        final long j14 = ((androidx.compose.ui.graphics.H) pair.b()).f13506a;
        float f10 = 48;
        androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(f10, f10, hVar);
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 32);
        c1086gP.L(1597269732);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = new androidx.compose.foundation.interaction.l();
            c1086gP.E(objF);
        }
        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objF;
        c1086gP.T(false);
        androidx.compose.material3.X xB = z12 ? RippleKt.b(20, 4, false) : null;
        c1086gP.L(1597274507);
        boolean z13 = ((((i10 & 896) ^ 384) > 256 && c1086gP.c(z12)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c1086gP.K(aVar)) || (i10 & 3072) == 2048);
        Object objF2 = c1086gP.f();
        if (z13 || objF2 == c0153a) {
            objF2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h0
                @Override // Ia.a
                public final Object invoke() {
                    return VoiceInputLayoutKt.IconWithPulsatingBox_DZNDmhg$lambda$15$lambda$14$lambda$13(z12, aVar);
                }
            };
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        PulsatingBoxKt.m546PulsatingBoxFU0evQE(ClickableKt.b(hVarM, kVar, xB, false, null, (Ia.a) objF2, 28), 1.0f + (speechRecognizerState.getAmplitude() * 0.3f), j13, null, speechRecognizerState.isListening(), androidx.compose.runtime.internal.a.b(491745621, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt$IconWithPulsatingBox$1$3
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0948h PulsatingBox, InterfaceC1084f interfaceC1084f2, int i13) {
                kotlin.jvm.internal.i.e(PulsatingBox, "$this$PulsatingBox");
                if ((i13 & 14) == 0) {
                    i13 |= interfaceC1084f2.K(PulsatingBox) ? 4 : 2;
                }
                if ((i13 & 91) == 18 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    IconKt.a(U.c.a(R.drawable.intercom_ic_mic, interfaceC1084f2, 0), "Voice Input", androidx.compose.foundation.layout.W.m(PulsatingBox.f(androidx.compose.ui.h.a.f13984b, androidx.compose.ui.d.a.f13339e), speechRecognizerState.isListening() ? 18 : 24), j14, interfaceC1084f2, 56, 0);
                }
            }
        }, c1086gP), c1086gP, 196608, 8);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return VoiceInputLayoutKt.IconWithPulsatingBox_DZNDmhg$lambda$16(hVar, speechRecognizerState, z12, aVar, j, j10, j11, j12, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IconWithPulsatingBox_DZNDmhg$lambda$15$lambda$14$lambda$13(boolean z10, Ia.a onClick) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        if (z10) {
            onClick.invoke();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IconWithPulsatingBox_DZNDmhg$lambda$16(androidx.compose.ui.h modifier, SpeechRecognizerState speechRecognizerState, boolean z10, Ia.a onClick, long j, long j10, long j11, long j12, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(modifier, "$modifier");
        kotlin.jvm.internal.i.e(speechRecognizerState, "$speechRecognizerState");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        m205IconWithPulsatingBoxDZNDmhg(modifier, speechRecognizerState, z10, onClick, j, j10, j11, j12, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x018c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01af  */
    /* JADX WARN: Code duplicated, block: B:124:0x022d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:127:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119 A[PHI: r1 r3 r4 r6 r8 r10 r13
      0x0119: PHI (r1v12 androidx.compose.ui.h) = (r1v3 androidx.compose.ui.h), (r1v17 androidx.compose.ui.h) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r3v27 int) = (r3v17 int), (r3v32 int) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r4v5 boolean) = (r4v2 boolean), (r4v6 boolean) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r6v13 long) = (r6v7 long), (r6v6 long) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r8v9 long) = (r8v3 long), (r8v2 long) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r10v19 long) = (r10v3 long), (r10v2 long) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r13v13 long) = (r13v2 long), (r13v1 long) binds: [B:117:0x018a, B:96:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0122 A[DONT_INVERT] */
    /* JADX INFO: renamed from: VoiceInputLayout-Denoh9s, reason: not valid java name */
    public static final void m206VoiceInputLayoutDenoh9s(androidx.compose.ui.h hVar, boolean z10, long j, long j10, long j11, long j12, SpeechRecognizerState speechRecognizerState, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        long jB;
        long jB2;
        long jB3;
        long jB4;
        int i13;
        androidx.compose.ui.h hVar2;
        boolean z11;
        final SpeechRecognizerState speechRecognizerStateRememberSpeechRecognizerState;
        Context context;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final androidx.compose.runtime.X x10;
        final SpeechRecognizerState speechRecognizerState2;
        final androidx.compose.ui.h hVar3;
        final boolean z12;
        final long j13;
        final long j14;
        final long j15;
        final long j16;
        Object objF2;
        final androidx.compose.runtime.X x11;
        C1105p0 c1105p0V;
        int i14;
        int i15;
        C1086g c1086gP = interfaceC1084f.p(-1361517133);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.c(z10) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    jB = j;
                    int i18 = c1086gP.i(jB) ? 256 : 128;
                    i12 |= i18;
                } else {
                    jB = j;
                }
                i12 |= i18;
            } else {
                jB = j;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    jB2 = j10;
                    int i19 = c1086gP.i(jB2) ? 2048 : 1024;
                    i12 |= i19;
                } else {
                    jB2 = j10;
                }
                i12 |= i19;
            } else {
                jB2 = j10;
            }
            if ((i10 & 57344) == 0) {
                jB3 = j11;
                if ((i11 & 16) == 0 || !c1086gP.i(jB3)) {
                    i15 = 8192;
                } else {
                    i15 = 16384;
                }
                i12 |= i15;
            } else {
                jB3 = j11;
            }
            if ((i10 & 458752) == 0) {
                jB4 = j12;
                if ((i11 & 32) == 0 || !c1086gP.i(jB4)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i12 |= i14;
            } else {
                jB4 = j12;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 524288;
            }
            if (i13 != 64 && (i12 & 2995931) == 599186 && c1086gP.s()) {
                c1086gP.w();
                hVar3 = hVar;
                z12 = z10;
                j13 = jB;
                j14 = jB2;
                j16 = jB4;
                j15 = jB3;
                speechRecognizerState2 = speechRecognizerState;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 4) != 0) {
                        jB = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jB2 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jB3 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jB4 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        i12 &= -3670017;
                        speechRecognizerStateRememberSpeechRecognizerState = rememberSpeechRecognizerState(null, c1086gP, 0, 1);
                    }
                    long j17 = jB3;
                    int i20 = i12;
                    c1086gP.U();
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(1212224123);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    InterfaceC1376t interfaceC1376t = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    final com.google.accompanist.permissions.a aVarA = com.google.accompanist.permissions.d.a(c1086gP);
                    long j18 = jB4;
                    final androidx.activity.compose.e eVarA = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b0
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$3(speechRecognizerStateRememberSpeechRecognizerState, x10, ((Boolean) obj).booleanValue());
                        }
                    }, c1086gP, 8);
                    androidx.compose.runtime.E.a(interfaceC1376t, new c0(interfaceC1376t, 0, speechRecognizerStateRememberSpeechRecognizerState), c1086gP);
                    int i21 = i20 << 6;
                    int i22 = (i20 & 14) | 64 | ((i20 << 3) & 896) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128);
                    speechRecognizerState2 = speechRecognizerStateRememberSpeechRecognizerState;
                    m205IconWithPulsatingBoxDZNDmhg(hVar2, speechRecognizerStateRememberSpeechRecognizerState, z11, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d0
                        @Override // Ia.a
                        public final Object invoke() {
                            return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$7(aVarA, eVarA, speechRecognizerStateRememberSpeechRecognizerState);
                        }
                    }, jB, jB2, j17, j18, c1086gP, i22, 0);
                    if (VoiceInputLayout_Denoh9s$lambda$1(x10)) {
                        String string = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP = S4.o.p(c1086gP, R.string.intercom_settings);
                        String strP2 = S4.o.p(c1086gP, R.string.intercom_not_now);
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_mic);
                        c1086gP.L(1212294427);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            x11 = x10;
                            objF2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e0
                                @Override // Ia.a
                                public final Object invoke() {
                                    return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$9$lambda$8(x11);
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            x11 = x10;
                        }
                        c1086gP.T(false);
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string, strP, strP2, numValueOf, (Ia.a) objF2, new f0(context, 0, x11), c1086gP, 196608, 1);
                    }
                    hVar3 = hVar2;
                    z12 = z11;
                    j13 = jB;
                    j14 = jB2;
                    j15 = j17;
                    j16 = j18;
                } else {
                    c1086gP.w();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        i12 &= -3670017;
                    }
                    hVar2 = hVar;
                    z11 = z10;
                }
                speechRecognizerStateRememberSpeechRecognizerState = speechRecognizerState;
                long j19 = jB3;
                int i23 = i12;
                c1086gP.U();
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(1212224123);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                InterfaceC1376t interfaceC1376t2 = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                final com.google.accompanist.permissions.a aVarA2 = com.google.accompanist.permissions.d.a(c1086gP);
                long j110 = jB4;
                final androidx.activity.compose.e eVarA2 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b0
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$3(speechRecognizerStateRememberSpeechRecognizerState, x10, ((Boolean) obj).booleanValue());
                    }
                }, c1086gP, 8);
                androidx.compose.runtime.E.a(interfaceC1376t2, new c0(interfaceC1376t2, 0, speechRecognizerStateRememberSpeechRecognizerState), c1086gP);
                int i24 = i23 << 6;
                int i25 = (i23 & 14) | 64 | ((i23 << 3) & 896) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (i24 & 29360128);
                speechRecognizerState2 = speechRecognizerStateRememberSpeechRecognizerState;
                m205IconWithPulsatingBoxDZNDmhg(hVar2, speechRecognizerStateRememberSpeechRecognizerState, z11, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d0
                    @Override // Ia.a
                    public final Object invoke() {
                        return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$7(aVarA2, eVarA2, speechRecognizerStateRememberSpeechRecognizerState);
                    }
                }, jB, jB2, j19, j110, c1086gP, i25, 0);
                if (VoiceInputLayout_Denoh9s$lambda$1(x10)) {
                    String string2 = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP3 = S4.o.p(c1086gP, R.string.intercom_settings);
                    String strP4 = S4.o.p(c1086gP, R.string.intercom_not_now);
                    Integer numValueOf2 = Integer.valueOf(R.drawable.intercom_ic_mic);
                    c1086gP.L(1212294427);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        x11 = x10;
                        objF2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e0
                            @Override // Ia.a
                            public final Object invoke() {
                                return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$9$lambda$8(x11);
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        x11 = x10;
                    }
                    c1086gP.T(false);
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string2, strP3, strP4, numValueOf2, (Ia.a) objF2, new f0(context, 0, x11), c1086gP, 196608, 1);
                }
                hVar3 = hVar2;
                z12 = z11;
                j13 = jB;
                j14 = jB2;
                j15 = j19;
                j16 = j110;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$11(hVar3, z12, j13, j14, j15, j16, speechRecognizerState2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jB = j;
                if (c1086gP.i(jB)) {
                }
                i12 |= i18;
            } else {
                jB = j;
            }
            i12 |= i18;
        } else {
            jB = j;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jB2 = j10;
                if (c1086gP.i(jB2)) {
                }
                i12 |= i19;
            } else {
                jB2 = j10;
            }
            i12 |= i19;
        } else {
            jB2 = j10;
        }
        if ((i10 & 57344) == 0) {
            jB3 = j11;
            if ((i11 & 16) == 0) {
                i15 = 8192;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        } else {
            jB3 = j11;
        }
        if ((i10 & 458752) == 0) {
            jB4 = j12;
            if ((i11 & 32) == 0) {
                i14 = 65536;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        } else {
            jB4 = j12;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 524288;
        }
        if (i13 != 64) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 4) != 0) {
                    jB = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jB2 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jB3 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jB4 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    i12 &= -3670017;
                    speechRecognizerStateRememberSpeechRecognizerState = rememberSpeechRecognizerState(null, c1086gP, 0, 1);
                } else {
                    speechRecognizerStateRememberSpeechRecognizerState = speechRecognizerState;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 4) != 0) {
                    jB = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jB2 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jB3 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jB4 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    i12 &= -3670017;
                    speechRecognizerStateRememberSpeechRecognizerState = rememberSpeechRecognizerState(null, c1086gP, 0, 1);
                } else {
                    speechRecognizerStateRememberSpeechRecognizerState = speechRecognizerState;
                }
            }
            long j111 = jB3;
            int i26 = i12;
            c1086gP.U();
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            c1086gP.L(1212224123);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            x10 = (androidx.compose.runtime.X) objF;
            c1086gP.T(false);
            InterfaceC1376t interfaceC1376t3 = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final com.google.accompanist.permissions.a aVarA3 = com.google.accompanist.permissions.d.a(c1086gP);
            long j112 = jB4;
            final androidx.activity.compose.e eVarA3 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b0
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$3(speechRecognizerStateRememberSpeechRecognizerState, x10, ((Boolean) obj).booleanValue());
                }
            }, c1086gP, 8);
            androidx.compose.runtime.E.a(interfaceC1376t3, new c0(interfaceC1376t3, 0, speechRecognizerStateRememberSpeechRecognizerState), c1086gP);
            int i27 = i26 << 6;
            int i28 = (i26 & 14) | 64 | ((i26 << 3) & 896) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128);
            speechRecognizerState2 = speechRecognizerStateRememberSpeechRecognizerState;
            m205IconWithPulsatingBoxDZNDmhg(hVar2, speechRecognizerStateRememberSpeechRecognizerState, z11, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d0
                @Override // Ia.a
                public final Object invoke() {
                    return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$7(aVarA3, eVarA3, speechRecognizerStateRememberSpeechRecognizerState);
                }
            }, jB, jB2, j111, j112, c1086gP, i28, 0);
            if (VoiceInputLayout_Denoh9s$lambda$1(x10)) {
                String string3 = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strP5 = S4.o.p(c1086gP, R.string.intercom_settings);
                String strP6 = S4.o.p(c1086gP, R.string.intercom_not_now);
                Integer numValueOf3 = Integer.valueOf(R.drawable.intercom_ic_mic);
                c1086gP.L(1212294427);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    x11 = x10;
                    objF2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e0
                        @Override // Ia.a
                        public final Object invoke() {
                            return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$9$lambda$8(x11);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    x11 = x10;
                }
                c1086gP.T(false);
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string3, strP5, strP6, numValueOf3, (Ia.a) objF2, new f0(context, 0, x11), c1086gP, 196608, 1);
            }
            hVar3 = hVar2;
            z12 = z11;
            j13 = jB;
            j14 = jB2;
            j15 = j111;
            j16 = j112;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 4) != 0) {
                    jB = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jB2 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jB3 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jB4 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    i12 &= -3670017;
                    speechRecognizerStateRememberSpeechRecognizerState = rememberSpeechRecognizerState(null, c1086gP, 0, 1);
                } else {
                    speechRecognizerStateRememberSpeechRecognizerState = speechRecognizerState;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 4) != 0) {
                    jB = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jB2 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jB3 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jB4 = androidx.compose.ui.graphics.H.b(0.5f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    i12 &= -3670017;
                    speechRecognizerStateRememberSpeechRecognizerState = rememberSpeechRecognizerState(null, c1086gP, 0, 1);
                } else {
                    speechRecognizerStateRememberSpeechRecognizerState = speechRecognizerState;
                }
            }
            long j113 = jB3;
            int i29 = i12;
            c1086gP.U();
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            c1086gP.L(1212224123);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            x10 = (androidx.compose.runtime.X) objF;
            c1086gP.T(false);
            InterfaceC1376t interfaceC1376t4 = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final com.google.accompanist.permissions.a aVarA4 = com.google.accompanist.permissions.d.a(c1086gP);
            long j114 = jB4;
            final androidx.activity.compose.e eVarA4 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b0
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$3(speechRecognizerStateRememberSpeechRecognizerState, x10, ((Boolean) obj).booleanValue());
                }
            }, c1086gP, 8);
            androidx.compose.runtime.E.a(interfaceC1376t4, new c0(interfaceC1376t4, 0, speechRecognizerStateRememberSpeechRecognizerState), c1086gP);
            int i210 = i29 << 6;
            int i211 = (i29 & 14) | 64 | ((i29 << 3) & 896) | (57344 & i210) | (458752 & i210) | (3670016 & i210) | (i210 & 29360128);
            speechRecognizerState2 = speechRecognizerStateRememberSpeechRecognizerState;
            m205IconWithPulsatingBoxDZNDmhg(hVar2, speechRecognizerStateRememberSpeechRecognizerState, z11, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d0
                @Override // Ia.a
                public final Object invoke() {
                    return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$7(aVarA4, eVarA4, speechRecognizerStateRememberSpeechRecognizerState);
                }
            }, jB, jB2, j113, j114, c1086gP, i211, 0);
            if (VoiceInputLayout_Denoh9s$lambda$1(x10)) {
                String string4 = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strP7 = S4.o.p(c1086gP, R.string.intercom_settings);
                String strP8 = S4.o.p(c1086gP, R.string.intercom_not_now);
                Integer numValueOf4 = Integer.valueOf(R.drawable.intercom_ic_mic);
                c1086gP.L(1212294427);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    x11 = x10;
                    objF2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e0
                        @Override // Ia.a
                        public final Object invoke() {
                            return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$9$lambda$8(x11);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    x11 = x10;
                }
                c1086gP.T(false);
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string4, strP7, strP8, numValueOf4, (Ia.a) objF2, new f0(context, 0, x11), c1086gP, 196608, 1);
            }
            hVar3 = hVar2;
            z12 = z11;
            j13 = jB;
            j14 = jB2;
            j15 = j113;
            j16 = j114;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$11(hVar3, z12, j13, j14, j15, j16, speechRecognizerState2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean VoiceInputLayout_Denoh9s$lambda$1(androidx.compose.runtime.X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VoiceInputLayout_Denoh9s$lambda$10(Context context, androidx.compose.runtime.X showPermissionDeniedDialog$delegate) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(showPermissionDeniedDialog$delegate, "$showPermissionDeniedDialog$delegate");
        VoiceInputLayout_Denoh9s$lambda$2(showPermissionDeniedDialog$delegate, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VoiceInputLayout_Denoh9s$lambda$11(androidx.compose.ui.h hVar, boolean z10, long j, long j10, long j11, long j12, SpeechRecognizerState speechRecognizerState, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        m206VoiceInputLayoutDenoh9s(hVar, z10, j, j10, j11, j12, speechRecognizerState, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void VoiceInputLayout_Denoh9s$lambda$2(androidx.compose.runtime.X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VoiceInputLayout_Denoh9s$lambda$3(SpeechRecognizerState speechRecognizerState, androidx.compose.runtime.X showPermissionDeniedDialog$delegate, boolean z10) {
        kotlin.jvm.internal.i.e(showPermissionDeniedDialog$delegate, "$showPermissionDeniedDialog$delegate");
        if (z10) {
            speechRecognizerState.startListening();
        } else {
            VoiceInputLayout_Denoh9s$lambda$2(showPermissionDeniedDialog$delegate, true);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.A VoiceInputLayout_Denoh9s$lambda$6(final InterfaceC1376t lifecycleOwner, final SpeechRecognizerState speechRecognizerState, androidx.compose.runtime.B DisposableEffect) {
        kotlin.jvm.internal.i.e(lifecycleOwner, "$lifecycleOwner");
        kotlin.jvm.internal.i.e(DisposableEffect, "$this$DisposableEffect");
        final androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.a0
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$6$lambda$4(speechRecognizerState, interfaceC1376t, event);
            }
        };
        lifecycleOwner.getLifecycle().a(rVar);
        return new androidx.compose.runtime.A() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt$VoiceInputLayout_Denoh9s$lambda$6$$inlined$onDispose$1
            @Override // androidx.compose.runtime.A
            public void dispose() {
                lifecycleOwner.getLifecycle().c(rVar);
                speechRecognizerState.stopListening();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VoiceInputLayout_Denoh9s$lambda$6$lambda$4(SpeechRecognizerState speechRecognizerState, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(interfaceC1376t, "<unused var>");
        kotlin.jvm.internal.i.e(event, "event");
        if (event == Lifecycle.Event.ON_PAUSE) {
            speechRecognizerState.stopListening();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VoiceInputLayout_Denoh9s$lambda$7(com.google.accompanist.permissions.c audioPermissionState, androidx.activity.compose.e permissionRequestLauncher, SpeechRecognizerState speechRecognizerState) {
        kotlin.jvm.internal.i.e(audioPermissionState, "$audioPermissionState");
        kotlin.jvm.internal.i.e(permissionRequestLauncher, "$permissionRequestLauncher");
        VoiceInputLayout_Denoh9s$onClick(audioPermissionState, permissionRequestLauncher, speechRecognizerState);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VoiceInputLayout_Denoh9s$lambda$9$lambda$8(androidx.compose.runtime.X showPermissionDeniedDialog$delegate) {
        kotlin.jvm.internal.i.e(showPermissionDeniedDialog$delegate, "$showPermissionDeniedDialog$delegate");
        VoiceInputLayout_Denoh9s$lambda$2(showPermissionDeniedDialog$delegate, false);
        return p293xa.r.f47939a;
    }

    private static final void VoiceInputLayout_Denoh9s$onClick(com.google.accompanist.permissions.c cVar, androidx.activity.compose.e<String, Boolean> eVar, SpeechRecognizerState speechRecognizerState) {
        com.google.accompanist.permissions.e eVarD = cVar.d();
        kotlin.jvm.internal.i.e(eVarD, "<this>");
        if (!eVarD.equals(com.google.accompanist.permissions.e.b.f25218a)) {
            eVar.a("android.permission.RECORD_AUDIO");
        } else if (speechRecognizerState.isListening()) {
            speechRecognizerState.stopListening();
        } else {
            speechRecognizerState.startListening();
        }
    }

    public static final SpeechRecognizerState rememberSpeechRecognizerState(Ia.l<? super SpeechRecognizerState.SpeechState, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(1459481519);
        if ((i11 & 1) != 0) {
            lVar = new p050db.y(1);
        }
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context);
        boolean zIsRecognitionAvailable = SpeechRecognizer.isRecognitionAvailable(context);
        interfaceC1084f.L(1305055235);
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            kotlin.jvm.internal.i.b(speechRecognizerCreateSpeechRecognizer);
            objF = new SpeechRecognizerState(speechRecognizerCreateSpeechRecognizer, zIsRecognitionAvailable, lVar);
            interfaceC1084f.E(objF);
        }
        SpeechRecognizerState speechRecognizerState = (SpeechRecognizerState) objF;
        interfaceC1084f.D();
        interfaceC1084f.D();
        return speechRecognizerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r rememberSpeechRecognizerState$lambda$17(SpeechRecognizerState.SpeechState it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }
}
