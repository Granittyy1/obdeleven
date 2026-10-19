package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UploadSizeLimitDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadSizeLimitDialogKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$3, reason: invalid class name */
    /* JADX INFO: compiled from: UploadSizeLimitDialog.kt */
    public static final class AnonymousClass3 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Ia.a<p293xa.r> $onDismiss;

        public AnonymousClass3(Ia.a<p293xa.r> aVar) {
            this.$onDismiss = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(Ia.a aVar) {
            aVar.invoke();
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            interfaceC1084f.L(-891282084);
            boolean zK = interfaceC1084f.K(this.$onDismiss);
            Ia.a<p293xa.r> aVar = this.$onDismiss;
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Z(0, aVar);
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            ButtonKt.c((Ia.a) objF, null, false, null, null, null, null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m179getLambda1$intercom_sdk_base_release(), interfaceC1084f, 805306368, 510);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void UploadSizeLimitDialog(final String title, final String message, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        Ia.a<p293xa.r> aVar2;
        Ia.a<p293xa.r> kVar;
        boolean z10;
        Object objF;
        final Ia.a<p293xa.r> aVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(message, "message");
        C1086g c1086gP = interfaceC1084f.p(-2057533015);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(message) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 896) == 0) {
                aVar2 = aVar;
                i12 |= c1086gP.k(aVar2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                if (i13 != 0) {
                    kVar = new p050db.k(1);
                } else {
                    kVar = aVar2;
                }
                long jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
                androidx.compose.ui.window.f fVar = new androidx.compose.ui.window.f(5);
                c1086gP.L(-537314259);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new io.intercom.android.sdk.f(1, kVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                aVar3 = kVar;
                AndroidAlertDialog_androidKt.a((Ia.a) objF, androidx.compose.runtime.internal.a.b(582096881, new AnonymousClass3(kVar), c1086gP), null, null, null, androidx.compose.runtime.internal.a.b(-905132043, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                        if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        androidx.compose.ui.text.F type03 = intercomTheme.getTypography(interfaceC1084f2, i15).getType03();
                        TextKt.b(title, null, intercomTheme.getColors(interfaceC1084f2, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), androidx.compose.runtime.internal.a.b(-203197450, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                        if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        androidx.compose.ui.text.F type04 = intercomTheme.getTypography(interfaceC1084f2, i15).getType04();
                        TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                    }
                }, c1086gP), null, jM621getBackground0d7_KjU, 0L, 0L, 0L, 0.0f, fVar, c1086gP, 1769520, 3072, 7836);
            } else {
                c1086gP.w();
                aVar3 = aVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.X
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$3(title, message, aVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        aVar2 = aVar;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                kVar = new p050db.k(1);
            } else {
                kVar = aVar2;
            }
            long jM621getBackground0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
            androidx.compose.ui.window.f fVar2 = new androidx.compose.ui.window.f(5);
            c1086gP.L(-537314259);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new io.intercom.android.sdk.f(1, kVar);
                c1086gP.E(objF);
            } else {
                objF = new io.intercom.android.sdk.f(1, kVar);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            aVar3 = kVar;
            AndroidAlertDialog_androidKt.a((Ia.a) objF, androidx.compose.runtime.internal.a.b(582096881, new AnonymousClass3(kVar), c1086gP), null, null, null, androidx.compose.runtime.internal.a.b(-905132043, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    androidx.compose.ui.text.F type03 = intercomTheme.getTypography(interfaceC1084f2, i15).getType03();
                    TextKt.b(title, null, intercomTheme.getColors(interfaceC1084f2, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, interfaceC1084f2, 0, 0, 65530);
                }
            }, c1086gP), androidx.compose.runtime.internal.a.b(-203197450, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    androidx.compose.ui.text.F type04 = intercomTheme.getTypography(interfaceC1084f2, i15).getType04();
                    TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                }
            }, c1086gP), null, jM621getBackground0d7_KjU2, 0L, 0L, 0L, 0.0f, fVar2, c1086gP, 1769520, 3072, 7836);
        } else {
            if (i13 != 0) {
                kVar = new p050db.k(1);
            } else {
                kVar = aVar2;
            }
            long jM621getBackground0d7_KjU3 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
            androidx.compose.ui.window.f fVar3 = new androidx.compose.ui.window.f(5);
            c1086gP.L(-537314259);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new io.intercom.android.sdk.f(1, kVar);
                c1086gP.E(objF);
            } else {
                objF = new io.intercom.android.sdk.f(1, kVar);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            aVar3 = kVar;
            AndroidAlertDialog_androidKt.a((Ia.a) objF, androidx.compose.runtime.internal.a.b(582096881, new AnonymousClass3(kVar), c1086gP), null, null, null, androidx.compose.runtime.internal.a.b(-905132043, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    androidx.compose.ui.text.F type03 = intercomTheme.getTypography(interfaceC1084f2, i15).getType03();
                    TextKt.b(title, null, intercomTheme.getColors(interfaceC1084f2, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, interfaceC1084f2, 0, 0, 65530);
                }
            }, c1086gP), androidx.compose.runtime.internal.a.b(-203197450, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    androidx.compose.ui.text.F type04 = intercomTheme.getTypography(interfaceC1084f2, i15).getType04();
                    TextKt.b(message, null, intercomTheme.getColors(interfaceC1084f2, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, interfaceC1084f2, 0, 0, 65530);
                }
            }, c1086gP), null, jM621getBackground0d7_KjU3, 0L, 0L, 0L, 0.0f, fVar3, c1086gP, 1769520, 3072, 7836);
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.X
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$3(title, message, aVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadSizeLimitDialog$lambda$2$lambda$1(Ia.a aVar) {
        aVar.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadSizeLimitDialog$lambda$3(String title, String message, Ia.a aVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(message, "$message");
        UploadSizeLimitDialog(title, message, aVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void UploadSizeLimitDialogPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-532105575);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m180getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadSizeLimitDialogPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UploadSizeLimitDialogPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
