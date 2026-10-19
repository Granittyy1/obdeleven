package io.intercom.android.sdk.m5.home.ui.header;

import Ia.p;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.Z;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import coil.compose.u;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.components.P;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.components.T;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HomeHeaderBackdrop.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeHeaderBackdropKt {
    public static final void ConsistentFadeBehaviorPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-551060646);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m318getLambda7$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ConsistentFadeBehaviorPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ConsistentFadeBehaviorPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void CrossTypeGradientToSolidPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(60882784);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m317getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r CrossTypeGradientToSolidPreview$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CrossTypeGradientToSolidPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void CrossTypeSolidToGradientPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1289954070);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m316getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r CrossTypeSolidToGradientPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CrossTypeSolidToGradientPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void GradientHeaderBackdropPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1564631091);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m313getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r GradientHeaderBackdropPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        GradientHeaderBackdropPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void GradientHeaderBackdropWithFadePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-205873713);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m315getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r GradientHeaderBackdropWithFadePreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        GradientHeaderBackdropWithFadePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0287  */
    /* JADX WARN: Code duplicated, block: B:105:0x029a  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x020a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0211  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233  */
    /* JADX WARN: Code duplicated, block: B:97:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x0264  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: HomeHeaderBackdrop-AjpBEmI, reason: not valid java name */
    public static final void m323HomeHeaderBackdropAjpBEmI(final float f10, final HomeUiState.Content.ContentHeader.HeaderBackdropStyle backdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, final Ia.a<r> onImageLoaded, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle2;
        int i13;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle3;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle4;
        androidx.compose.ui.h.a aVar;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        C0949i c0949i;
        float f11;
        boolean z10;
        h0.a aVar3;
        ?? r10;
        androidx.compose.ui.h.a aVar4;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle5;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid;
        int i15;
        int i16;
        float f12;
        boolean z11;
        Object objF;
        final HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle6;
        float f13;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient gradient;
        float f14;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(backdropStyle, "backdropStyle");
        kotlin.jvm.internal.i.e(onImageLoaded, "onImageLoaded");
        C1086g c1086gP = interfaceC1084f.p(1754935872);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.g(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(backdropStyle) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                headerBackdropStyle2 = headerBackdropStyle;
                i12 |= c1086gP.K(headerBackdropStyle2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onImageLoaded)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !c1086gP.s()) {
                if (i17 != 0) {
                    headerBackdropStyle3 = null;
                } else {
                    headerBackdropStyle3 = headerBackdropStyle2;
                }
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6) || headerBackdropStyle3 == null) {
                    headerBackdropStyle4 = backdropStyle;
                } else {
                    headerBackdropStyle4 = headerBackdropStyle3;
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                c0949i = C0949i.f10304a;
                f11 = 1.0f;
                if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                    c1086gP.L(1047420935);
                    gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle4;
                    androidx.compose.ui.h hVarA = C0932d.a(aVar, new Z(gradient.getColors(), null, 0L, 9187343241974906880L, 0));
                    if (gradient.getFade()) {
                        f14 = 160;
                    } else {
                        f14 = 80;
                    }
                    BoxKt.a(W.d(W.e(hVarA, f14 + f10), 1.0f), c1086gP, 0);
                    c1086gP.T(false);
                    i16 = 80;
                    i15 = 160;
                    r10 = 0;
                    aVar4 = aVar;
                    headerBackdropStyle5 = headerBackdropStyle4;
                } else {
                    z10 = headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                    aVar3 = h0.f13629a;
                    if (z10) {
                        c1086gP.L(1047880603);
                        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        coil.request.g.a aVar5 = new coil.request.g.a(context);
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle4;
                        aVar5.f23074c = image.getImageUrl();
                        aVar5.b();
                        coil.request.g gVarA = aVar5.a();
                        coil.f imageLoader = IntercomImageLoaderKt.getImageLoader(context);
                        InterfaceC1161g.a.C0159a c0159a = InterfaceC1161g.a.f14243a;
                        androidx.compose.ui.h hVarD = W.d(W.e(C0932d.b(aVar, image.m294getFallbackColor0d7_KjU(), aVar3), 80 + f10), 1.0f);
                        c1086gP.L(-1074554204);
                        if ((i12 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11 || objF == InterfaceC1084f.a.f12980a) {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.home.ui.header.i
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.a.d) obj);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        aVar4 = aVar;
                        u.a(gVarA, null, imageLoader, hVarD, null, null, null, (Ia.l) objF, null, c0159a, c1086gP, 568, 384, 257520);
                        r10 = 0;
                        c1086gP.T(false);
                        headerBackdropStyle5 = headerBackdropStyle4;
                        i15 = 160;
                        i16 = 80;
                        f11 = 1.0f;
                    } else {
                        r10 = 0;
                        aVar4 = aVar;
                        headerBackdropStyle5 = headerBackdropStyle4;
                        if (!(headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                            c1086gP.L(-1074592113);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(1048705854);
                        solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle5;
                        androidx.compose.ui.h hVarB = C0932d.b(aVar4, solid.m298getColor0d7_KjU(), aVar3);
                        if (solid.getFade()) {
                            i15 = 160;
                            f12 = 160;
                            i16 = 80;
                        } else {
                            i15 = 160;
                            i16 = 80;
                            f12 = 80;
                        }
                        androidx.compose.ui.h hVarE = W.e(hVarB, f12 + f10);
                        f11 = 1.0f;
                        BoxKt.a(W.d(hVarE, 1.0f), c1086gP, 0);
                        c1086gP.T(false);
                    }
                }
                c1086gP.L(-1074538392);
                if (headerBackdropStyle5.getFade()) {
                    androidx.compose.ui.h hVarA2 = C0932d.a(aVar4, C.a.a(kotlin.collections.l.s(new H(H.f13503k), new H(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU())), 0.0f, 0.0f, 14));
                    if (headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                        f13 = i16;
                    } else {
                        f13 = i15;
                    }
                    BoxKt.a(c0949i.f(W.d(W.e(hVarA2, f13), f11), androidx.compose.ui.d.a.f13342h), c1086gP, r10);
                }
                c1086gP.T(r10);
                c1086gP.T(true);
                headerBackdropStyle6 = headerBackdropStyle3;
            } else {
                c1086gP.w();
                headerBackdropStyle6 = headerBackdropStyle2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.home.ui.header.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f10, backdropStyle, headerBackdropStyle6, onImageLoaded, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        headerBackdropStyle2 = headerBackdropStyle;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(onImageLoaded)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            if (i17 != 0) {
                headerBackdropStyle3 = null;
            } else {
                headerBackdropStyle3 = headerBackdropStyle2;
            }
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6)) {
                headerBackdropStyle4 = backdropStyle;
            } else {
                headerBackdropStyle4 = backdropStyle;
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            c0949i = C0949i.f10304a;
            f11 = 1.0f;
            if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                c1086gP.L(1047420935);
                gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle4;
                androidx.compose.ui.h hVarA3 = C0932d.a(aVar, new Z(gradient.getColors(), null, 0L, 9187343241974906880L, 0));
                if (gradient.getFade()) {
                    f14 = 160;
                } else {
                    f14 = 80;
                }
                BoxKt.a(W.d(W.e(hVarA3, f14 + f10), 1.0f), c1086gP, 0);
                c1086gP.T(false);
                i16 = 80;
                i15 = 160;
                r10 = 0;
                aVar4 = aVar;
                headerBackdropStyle5 = headerBackdropStyle4;
            } else {
                z10 = headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                aVar3 = h0.f13629a;
                if (z10) {
                    c1086gP.L(1047880603);
                    Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    coil.request.g.a aVar6 = new coil.request.g.a(context2);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image2 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle4;
                    aVar6.f23074c = image2.getImageUrl();
                    aVar6.b();
                    coil.request.g gVarA2 = aVar6.a();
                    coil.f imageLoader2 = IntercomImageLoaderKt.getImageLoader(context2);
                    InterfaceC1161g.a.C0159a c0159a2 = InterfaceC1161g.a.f14243a;
                    androidx.compose.ui.h hVarD2 = W.d(W.e(C0932d.b(aVar, image2.m294getFallbackColor0d7_KjU(), aVar3), 80 + f10), 1.0f);
                    c1086gP.L(-1074554204);
                    if ((i12 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.home.ui.header.i
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.a.d) obj);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.home.ui.header.i
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.a.d) obj);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    aVar4 = aVar;
                    u.a(gVarA2, null, imageLoader2, hVarD2, null, null, null, (Ia.l) objF, null, c0159a2, c1086gP, 568, 384, 257520);
                    r10 = 0;
                    c1086gP.T(false);
                    headerBackdropStyle5 = headerBackdropStyle4;
                    i15 = 160;
                    i16 = 80;
                    f11 = 1.0f;
                } else {
                    r10 = 0;
                    aVar4 = aVar;
                    headerBackdropStyle5 = headerBackdropStyle4;
                    if (!(headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                        c1086gP.L(-1074592113);
                        c1086gP.T(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086gP.L(1048705854);
                    solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle5;
                    androidx.compose.ui.h hVarB2 = C0932d.b(aVar4, solid.m298getColor0d7_KjU(), aVar3);
                    if (solid.getFade()) {
                        i15 = 160;
                        f12 = 160;
                        i16 = 80;
                    } else {
                        i15 = 160;
                        i16 = 80;
                        f12 = 80;
                    }
                    androidx.compose.ui.h hVarE2 = W.e(hVarB2, f12 + f10);
                    f11 = 1.0f;
                    BoxKt.a(W.d(hVarE2, 1.0f), c1086gP, 0);
                    c1086gP.T(false);
                }
            }
            c1086gP.L(-1074538392);
            if (headerBackdropStyle5.getFade()) {
                androidx.compose.ui.h hVarA4 = C0932d.a(aVar4, C.a.a(kotlin.collections.l.s(new H(H.f13503k), new H(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU())), 0.0f, 0.0f, 14));
                if (headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    f13 = i16;
                } else {
                    f13 = i15;
                }
                BoxKt.a(c0949i.f(W.d(W.e(hVarA4, f13), f11), androidx.compose.ui.d.a.f13342h), c1086gP, r10);
            }
            c1086gP.T(r10);
            c1086gP.T(true);
            headerBackdropStyle6 = headerBackdropStyle3;
        } else {
            if (i17 != 0) {
                headerBackdropStyle3 = null;
            } else {
                headerBackdropStyle3 = headerBackdropStyle2;
            }
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6)) {
                headerBackdropStyle4 = backdropStyle;
            } else {
                headerBackdropStyle4 = backdropStyle;
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            c0949i = C0949i.f10304a;
            f11 = 1.0f;
            if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                c1086gP.L(1047420935);
                gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle4;
                androidx.compose.ui.h hVarA5 = C0932d.a(aVar, new Z(gradient.getColors(), null, 0L, 9187343241974906880L, 0));
                if (gradient.getFade()) {
                    f14 = 160;
                } else {
                    f14 = 80;
                }
                BoxKt.a(W.d(W.e(hVarA5, f14 + f10), 1.0f), c1086gP, 0);
                c1086gP.T(false);
                i16 = 80;
                i15 = 160;
                r10 = 0;
                aVar4 = aVar;
                headerBackdropStyle5 = headerBackdropStyle4;
            } else {
                z10 = headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                aVar3 = h0.f13629a;
                if (z10) {
                    c1086gP.L(1047880603);
                    Context context3 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    coil.request.g.a aVar7 = new coil.request.g.a(context3);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image3 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle4;
                    aVar7.f23074c = image3.getImageUrl();
                    aVar7.b();
                    coil.request.g gVarA3 = aVar7.a();
                    coil.f imageLoader3 = IntercomImageLoaderKt.getImageLoader(context3);
                    InterfaceC1161g.a.C0159a c0159a3 = InterfaceC1161g.a.f14243a;
                    androidx.compose.ui.h hVarD3 = W.d(W.e(C0932d.b(aVar, image3.m294getFallbackColor0d7_KjU(), aVar3), 80 + f10), 1.0f);
                    c1086gP.L(-1074554204);
                    if ((i12 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.home.ui.header.i
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.a.d) obj);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.home.ui.header.i
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.a.d) obj);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    aVar4 = aVar;
                    u.a(gVarA3, null, imageLoader3, hVarD3, null, null, null, (Ia.l) objF, null, c0159a3, c1086gP, 568, 384, 257520);
                    r10 = 0;
                    c1086gP.T(false);
                    headerBackdropStyle5 = headerBackdropStyle4;
                    i15 = 160;
                    i16 = 80;
                    f11 = 1.0f;
                } else {
                    r10 = 0;
                    aVar4 = aVar;
                    headerBackdropStyle5 = headerBackdropStyle4;
                    if (!(headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                        c1086gP.L(-1074592113);
                        c1086gP.T(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086gP.L(1048705854);
                    solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle5;
                    androidx.compose.ui.h hVarB3 = C0932d.b(aVar4, solid.m298getColor0d7_KjU(), aVar3);
                    if (solid.getFade()) {
                        i15 = 160;
                        f12 = 160;
                        i16 = 80;
                    } else {
                        i15 = 160;
                        i16 = 80;
                        f12 = 80;
                    }
                    androidx.compose.ui.h hVarE3 = W.e(hVarB3, f12 + f10);
                    f11 = 1.0f;
                    BoxKt.a(W.d(hVarE3, 1.0f), c1086gP, 0);
                    c1086gP.T(false);
                }
            }
            c1086gP.L(-1074538392);
            if (headerBackdropStyle5.getFade()) {
                androidx.compose.ui.h hVarA6 = C0932d.a(aVar4, C.a.a(kotlin.collections.l.s(new H(H.f13503k), new H(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU())), 0.0f, 0.0f, 14));
                if (headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    f13 = i16;
                } else {
                    f13 = i15;
                }
                BoxKt.a(c0949i.f(W.d(W.e(hVarA6, f13), f11), androidx.compose.ui.d.a.f13342h), c1086gP, r10);
            }
            c1086gP.T(r10);
            c1086gP.T(true);
            headerBackdropStyle6 = headerBackdropStyle3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.home.ui.header.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f10, backdropStyle, headerBackdropStyle6, onImageLoaded, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(Ia.a onImageLoaded, AsyncImagePainter.a.d it) {
        kotlin.jvm.internal.i.e(onImageLoaded, "$onImageLoaded");
        kotlin.jvm.internal.i.e(it, "it");
        onImageLoaded.invoke();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeHeaderBackdrop_AjpBEmI$lambda$3(float f10, HomeUiState.Content.ContentHeader.HeaderBackdropStyle backdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, Ia.a onImageLoaded, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(backdropStyle, "$backdropStyle");
        kotlin.jvm.internal.i.e(onImageLoaded, "$onImageLoaded");
        m323HomeHeaderBackdropAjpBEmI(f10, backdropStyle, headerBackdropStyle, onImageLoaded, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void SolidHeaderBackdropPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(784552236);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m312getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SolidHeaderBackdropPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SolidHeaderBackdropPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void SolidHeaderBackdropWithFadePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(14975022);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m314getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SolidHeaderBackdropWithFadePreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SolidHeaderBackdropWithFadePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
