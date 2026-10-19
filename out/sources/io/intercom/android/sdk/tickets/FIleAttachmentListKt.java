package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.conversation.ui.components.Q;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.BoxedTextLayoutKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FIleAttachmentList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FIleAttachmentListKt {
    public static final void FailedFileAttached(androidx.compose.ui.h hVar, final String fileName, final FileType fileType, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final androidx.compose.ui.h hVar2;
        int i12;
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(fileType, "fileType");
        C1086g c1086gP = interfaceC1084f.p(912363521);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(fileName) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(fileType) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVar3 = i13 != 0 ? androidx.compose.ui.h.a.f13984b : hVar2;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            m475FileAttachmentvRFhKjU(hVar3, fileName, fileType, intercomTheme.getColors(c1086gP, i14).m633getError0d7_KjU(), intercomTheme.getColors(c1086gP, i14).m633getError0d7_KjU(), ComposableSingletons$FIleAttachmentListKt.INSTANCE.m458getLambda1$intercom_sdk_base_release(), null, c1086gP, 196608 | (i12 & 14) | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i12 & 896), 64);
            hVar2 = hVar3;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.e
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FIleAttachmentListKt.FailedFileAttached$lambda$5(hVar2, fileName, fileType, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FailedFileAttached$lambda$5(androidx.compose.ui.h hVar, String fileName, FileType fileType, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(fileName, "$fileName");
        kotlin.jvm.internal.i.e(fileType, "$fileType");
        FailedFileAttached(hVar, fileName, fileType, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX INFO: renamed from: FileAttachment-vRFhKjU, reason: not valid java name */
    public static final void m475FileAttachmentvRFhKjU(androidx.compose.ui.h hVar, final String fileName, final FileType fileType, long j, long j10, Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        long jB;
        long jM645getPrimaryText0d7_KjU;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        int i13;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar4;
        int i14;
        androidx.compose.ui.h hVar2;
        long j11;
        long j12;
        final Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar5;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar6;
        androidx.compose.ui.h hVar3;
        final androidx.compose.ui.h hVar4;
        final long j13;
        final long j14;
        final Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar7;
        final Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar8;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(fileType, "fileType");
        C1086g c1086gP = interfaceC1084f.p(1921960973);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(fileName) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(fileType) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jB = j;
                int i16 = c1086gP.i(jB) ? 2048 : 1024;
                i12 |= i16;
            } else {
                jB = j;
            }
            i12 |= i16;
        } else {
            jB = j;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jM645getPrimaryText0d7_KjU = j10;
                int i17 = c1086gP.i(jM645getPrimaryText0d7_KjU) ? 16384 : 8192;
                i12 |= i17;
            } else {
                jM645getPrimaryText0d7_KjU = j10;
            }
            i12 |= i17;
        } else {
            jM645getPrimaryText0d7_KjU = j10;
        }
        int i18 = i11 & 32;
        if (i18 == 0) {
            if ((i10 & 458752) == 0) {
                qVar3 = qVar;
                i12 |= c1086gP.k(qVar3) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((3670016 & i10) == 0) {
                    qVar4 = qVar2;
                    if (c1086gP.k(qVar4)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((i12 & 2995931) == 599186 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i15 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 8) != 0) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                            i12 &= -57345;
                        }
                        if (i18 != 0) {
                            qVar3 = null;
                        }
                        if (i13 != 0) {
                            hVar3 = hVar2;
                            qVar6 = null;
                            j11 = jB;
                            j12 = jM645getPrimaryText0d7_KjU;
                            qVar5 = qVar3;
                        } else {
                            j11 = jB;
                            j12 = jM645getPrimaryText0d7_KjU;
                            qVar5 = qVar3;
                            qVar6 = qVar4;
                            hVar3 = hVar2;
                        }
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar;
                    }
                    c1086gP.U();
                    int i19 = i12 >> 3;
                    BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                        /* JADX INFO: compiled from: FIleAttachmentList.kt */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[FileType.values().length];
                                try {
                                    iArr[FileType.IMAGE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[FileType.VIDEO.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(u10, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                            int i21;
                            kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                            if ((i20 & 14) == 0) {
                                i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                            }
                            if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            if (qVar5 != null) {
                                interfaceC1084f2.L(1377519035);
                                qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(1377585003);
                            int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                            if (i22 != 1) {
                                i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                            } else {
                                i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                            }
                            IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i19 & 896) | (i19 & 7168) | (i19 & 458752), 0);
                    hVar4 = hVar3;
                    j13 = j11;
                    j14 = j12;
                    qVar7 = qVar6;
                    qVar8 = qVar5;
                } else {
                    c1086gP.w();
                    hVar4 = hVar;
                    j14 = jM645getPrimaryText0d7_KjU;
                    qVar8 = qVar3;
                    qVar7 = qVar4;
                    j13 = jB;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.f
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(hVar4, fileName, fileType, j13, j14, qVar8, qVar7, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 1572864;
            qVar4 = qVar2;
            if ((i12 & 2995931) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                }
                c1086gP.U();
                int i110 = i12 >> 3;
                BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: FIleAttachmentList.kt */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                        int i21;
                        kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i20 & 14) == 0) {
                            i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        if (qVar5 != null) {
                            interfaceC1084f2.L(1377519035);
                            qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(1377585003);
                        int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i22 != 1) {
                            i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                        } else {
                            i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                        }
                        IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i110 & 896) | (i110 & 7168) | (i110 & 458752), 0);
                hVar4 = hVar3;
                j13 = j11;
                j14 = j12;
                qVar7 = qVar6;
                qVar8 = qVar5;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                }
                c1086gP.U();
                int i111 = i12 >> 3;
                BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: FIleAttachmentList.kt */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                        int i21;
                        kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i20 & 14) == 0) {
                            i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        if (qVar5 != null) {
                            interfaceC1084f2.L(1377519035);
                            qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(1377585003);
                        int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i22 != 1) {
                            i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                        } else {
                            i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                        }
                        IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i111 & 896) | (i111 & 7168) | (i111 & 458752), 0);
                hVar4 = hVar3;
                j13 = j11;
                j14 = j12;
                qVar7 = qVar6;
                qVar8 = qVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.f
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(hVar4, fileName, fileType, j13, j14, qVar8, qVar7, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 196608;
        qVar3 = qVar;
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((3670016 & i10) == 0) {
                qVar4 = qVar2;
                if (c1086gP.k(qVar4)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i12 & 2995931) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                }
                c1086gP.U();
                int i112 = i12 >> 3;
                BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: FIleAttachmentList.kt */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                        int i21;
                        kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i20 & 14) == 0) {
                            i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        if (qVar5 != null) {
                            interfaceC1084f2.L(1377519035);
                            qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(1377585003);
                        int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i22 != 1) {
                            i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                        } else {
                            i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                        }
                        IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i112 & 896) | (i112 & 7168) | (i112 & 458752), 0);
                hVar4 = hVar3;
                j13 = j11;
                j14 = j12;
                qVar7 = qVar6;
                qVar8 = qVar5;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 8) != 0) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i12 &= -57345;
                    }
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        qVar6 = null;
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                    } else {
                        j11 = jB;
                        j12 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar4;
                        hVar3 = hVar2;
                    }
                }
                c1086gP.U();
                int i113 = i12 >> 3;
                BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: FIleAttachmentList.kt */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                        int i21;
                        kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                        if ((i20 & 14) == 0) {
                            i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        if (qVar5 != null) {
                            interfaceC1084f2.L(1377519035);
                            qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(1377585003);
                        int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i22 != 1) {
                            i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                        } else {
                            i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                        }
                        IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i113 & 896) | (i113 & 7168) | (i113 & 458752), 0);
                hVar4 = hVar3;
                j13 = j11;
                j14 = j12;
                qVar7 = qVar6;
                qVar8 = qVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.f
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(hVar4, fileName, fileType, j13, j14, qVar8, qVar7, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 1572864;
        qVar4 = qVar2;
        if ((i12 & 2995931) == 599186) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 8) != 0) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i18 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    qVar6 = null;
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                } else {
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar4;
                    hVar3 = hVar2;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 8) != 0) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i18 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    qVar6 = null;
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                } else {
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar4;
                    hVar3 = hVar2;
                }
            }
            c1086gP.U();
            int i114 = i12 >> 3;
            BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                /* JADX INFO: compiled from: FIleAttachmentList.kt */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                    int i21;
                    kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                    if ((i20 & 14) == 0) {
                        i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                    }
                    if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    if (qVar5 != null) {
                        interfaceC1084f2.L(1377519035);
                        qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                        interfaceC1084f2.D();
                        return;
                    }
                    interfaceC1084f2.L(1377585003);
                    int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i22 != 1) {
                        i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                    } else {
                        i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                    }
                    IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                    interfaceC1084f2.D();
                }
            }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i114 & 896) | (i114 & 7168) | (i114 & 458752), 0);
            hVar4 = hVar3;
            j13 = j11;
            j14 = j12;
            qVar7 = qVar6;
            qVar8 = qVar5;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 8) != 0) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i18 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    qVar6 = null;
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                } else {
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar4;
                    hVar3 = hVar2;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 8) != 0) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i12 &= -57345;
                }
                if (i18 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    qVar6 = null;
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                } else {
                    j11 = jB;
                    j12 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar4;
                    hVar3 = hVar2;
                }
            }
            c1086gP.U();
            int i115 = i12 >> 3;
            BoxedTextLayoutKt.m506BoxedTextLayoutY0xEhic(hVar3, fileName, j11, j12, androidx.compose.runtime.internal.a.b(-344274505, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                /* JADX INFO: compiled from: FIleAttachmentList.kt */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U BoxedTextLayout, InterfaceC1084f interfaceC1084f2, int i20) {
                    int i21;
                    kotlin.jvm.internal.i.e(BoxedTextLayout, "$this$BoxedTextLayout");
                    if ((i20 & 14) == 0) {
                        i20 |= interfaceC1084f2.K(BoxedTextLayout) ? 4 : 2;
                    }
                    if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    if (qVar5 != null) {
                        interfaceC1084f2.L(1377519035);
                        qVar5.invoke(BoxedTextLayout, interfaceC1084f2, Integer.valueOf(i20 & 14));
                        interfaceC1084f2.D();
                        return;
                    }
                    interfaceC1084f2.L(1377585003);
                    int i22 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i22 != 1) {
                        i21 = i22 != 2 ? io.intercom.android.sdk.R.drawable.intercom_ic_attachment : io.intercom.android.sdk.R.drawable.intercom_ic_video;
                    } else {
                        i21 = io.intercom.android.sdk.R.drawable.intercom_ic_image;
                    }
                    IconKt.a(U.c.a(i21, interfaceC1084f2, 0), "Image Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), 0L, interfaceC1084f2, 440, 8);
                    interfaceC1084f2.D();
                }
            }, c1086gP), qVar6, c1086gP, (i12 & 14) | 24576 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i115 & 896) | (i115 & 7168) | (i115 & 458752), 0);
            hVar4 = hVar3;
            j13 = j11;
            j14 = j12;
            qVar7 = qVar6;
            qVar8 = qVar5;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(hVar4, fileName, fileType, j13, j14, qVar8, qVar7, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    public static final void FileAttachmentList(androidx.compose.ui.h hVar, final List<Ticket.TicketAttribute.FilesAttribute.File> files, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(files, "files");
        C1086g c1086gP = interfaceC1084f.p(580044030);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        C0953m c0953mA = C0952l.a(C0945e.g(6), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1441890306);
        for (Ticket.TicketAttribute.FilesAttribute.File file : files) {
            m475FileAttachmentvRFhKjU(ClickableKt.c(aVar, false, null, new Q(file, 2, context), 7), file.getName(), file.getFileType(), 0L, 0L, null, null, c1086gP, 0, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            hVar2 = hVar2;
            context = context;
            aVar = aVar;
        }
        final androidx.compose.ui.h hVar3 = hVar2;
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.g
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i14 = i10;
                    int i15 = i11;
                    return FIleAttachmentListKt.FileAttachmentList$lambda$3(hVar4, files, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentList$lambda$2$lambda$1$lambda$0(Ticket.TicketAttribute.FilesAttribute.File file, Context context) {
        kotlin.jvm.internal.i.e(file, "$file");
        kotlin.jvm.internal.i.e(context, "$context");
        LinkOpener.handleUrl(file.getUrl(), context, Injector.get().getApi());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentList$lambda$3(androidx.compose.ui.h hVar, List files, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(files, "$files");
        FileAttachmentList(hVar, files, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-414644973);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FIleAttachmentListKt.INSTANCE.m459getLambda2$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachmentListPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FileAttachmentListPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileAttachment_vRFhKjU$lambda$4(androidx.compose.ui.h hVar, String fileName, FileType fileType, long j, long j10, Ia.q qVar, Ia.q qVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(fileName, "$fileName");
        kotlin.jvm.internal.i.e(fileType, "$fileType");
        m475FileAttachmentvRFhKjU(hVar, fileName, fileType, j, j10, qVar, qVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final FileType getFileType(String mimeType) {
        kotlin.jvm.internal.i.e(mimeType, "mimeType");
        if (kotlin.text.n.J(mimeType, AppearanceType.IMAGE, false)) {
            return FileType.IMAGE;
        }
        return kotlin.text.n.J(mimeType, "video", false) ? FileType.VIDEO : FileType.ATTACHMENT;
    }
}
