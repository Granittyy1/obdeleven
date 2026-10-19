package io.intercom.android.sdk.m5.components.avatar;

import A8.p;
import Ia.q;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import coil.compose.u;
import coil.compose.v;
import io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import p293xa.r;

/* JADX INFO: compiled from: AvatarIcon.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarIconKt$DefaultAvatar$1 implements q<InterfaceC0950j, InterfaceC1084f, Integer, r> {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ X<H> $backgroundColor$delegate;
    final /* synthetic */ H $customBackgroundColor;
    final /* synthetic */ X<l0> $cutShape$delegate;
    final /* synthetic */ long $defaultBackgroundColor;
    final /* synthetic */ X<p013b0.f> $indicatorSize$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ long $placeHolderTextSize;
    final /* synthetic */ l0 $shape;
    final /* synthetic */ boolean $shouldDrawBorder;
    final /* synthetic */ long $textColor;

    public AvatarIconKt$DefaultAvatar$1(boolean z10, l0 l0Var, boolean z11, X<p013b0.f> x10, X<l0> x11, X<H> x12, AvatarWrapper avatarWrapper, long j, H h8, long j10, long j11) {
        this.$isActive = z10;
        this.$shape = l0Var;
        this.$shouldDrawBorder = z11;
        this.$indicatorSize$delegate = x10;
        this.$cutShape$delegate = x11;
        this.$backgroundColor$delegate = x12;
        this.$avatarWrapper = avatarWrapper;
        this.$defaultBackgroundColor = j;
        this.$customBackgroundColor = h8;
        this.$textColor = j10;
        this.$placeHolderTextSize = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$6$lambda$1$lambda$0(long j, X backgroundColor$delegate, AsyncImagePainter.a.c it) {
        kotlin.jvm.internal.i.e(backgroundColor$delegate, "$backgroundColor$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        long jDefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(backgroundColor$delegate);
        int i10 = H.f13505m;
        if (H.c(jDefaultAvatar_Rd90Nhg$lambda$2, H.f13503k)) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, j);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$6$lambda$3$lambda$2(H h8, long j, X backgroundColor$delegate, AsyncImagePainter.a.d it) {
        kotlin.jvm.internal.i.e(backgroundColor$delegate, "$backgroundColor$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, h8 != null ? h8.f13506a : ColorExtensionsKt.m657darken8_81llA(j));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$6$lambda$5$lambda$4(long j, X backgroundColor$delegate, AsyncImagePainter.a.b it) {
        kotlin.jvm.internal.i.e(backgroundColor$delegate, "$backgroundColor$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        long jDefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(backgroundColor$delegate);
        int i10 = H.f13505m;
        if (H.c(jDefaultAvatar_Rd90Nhg$lambda$2, H.f13503k)) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, j);
        }
        return r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0950j, interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (interfaceC1084f.K(BoxWithConstraints) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        if (this.$isActive) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$6(this.$indicatorSize$delegate, Float.compare(BoxWithConstraints.d(), (float) 36) > 0 ? 16 : 8);
            this.$cutShape$delegate.setValue(new CutAvatarWithIndicatorShape(this.$shape, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate), null));
        } else {
            this.$cutShape$delegate.setValue(this.$shape);
        }
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarR = p.r(AvatarIconKt.avatarBorder(C0932d.b(BoxWithConstraints.j(), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(this.$backgroundColor$delegate), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate)), this.$shouldDrawBorder, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate)), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate));
        final AvatarWrapper avatarWrapper = this.$avatarWrapper;
        final long j = this.$defaultBackgroundColor;
        final H h8 = this.$customBackgroundColor;
        final long j10 = this.$textColor;
        final long j11 = this.$placeHolderTextSize;
        final X<H> x10 = this.$backgroundColor$delegate;
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int iF = interfaceC1084f.F();
        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarR);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        if (interfaceC1084f.u() == null) {
            I.b.k();
            throw null;
        }
        interfaceC1084f.r();
        if (interfaceC1084f.m()) {
            interfaceC1084f.v(aVar2);
        } else {
            interfaceC1084f.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, eD);
        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
        Ia.p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
            androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
        C0949i c0949i = C0949i.f10304a;
        String imageUrl = avatarWrapper.getImageUrl(interfaceC1084f, 8);
        androidx.compose.ui.h hVarI = c0949i.f(aVar, androidx.compose.ui.d.a.f13339e).i(W.f10226c);
        String label = avatarWrapper.getLabel();
        coil.f imageLoader = IntercomImageLoaderKt.getImageLoader((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b));
        InterfaceC1161g.a.C0159a c0159a = InterfaceC1161g.a.f14243a;
        ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1513639009, new Ia.r<v, AsyncImagePainter.a.c, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$1
            @Override // Ia.r
            public /* bridge */ /* synthetic */ r invoke(v vVar, AsyncImagePainter.a.c cVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(vVar, cVar, interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(v SubcomposeAsyncImage, AsyncImagePainter.a.c it, InterfaceC1084f interfaceC1084f2, int i12) {
                kotlin.jvm.internal.i.e(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                kotlin.jvm.internal.i.e(it, "it");
                if ((i12 & 14) == 0) {
                    i12 |= interfaceC1084f2.K(SubcomposeAsyncImage) ? 4 : 2;
                }
                if ((i12 & 651) == 130 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(avatarWrapper, j10, j11, SubcomposeAsyncImage.f(androidx.compose.ui.h.a.f13984b, androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0, 0);
                }
            }
        }, interfaceC1084f);
        ComposableLambdaImpl composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(427755177, new Ia.r<v, AsyncImagePainter.a.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$2
            @Override // Ia.r
            public /* bridge */ /* synthetic */ r invoke(v vVar, AsyncImagePainter.a.b bVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(vVar, bVar, interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(v SubcomposeAsyncImage, AsyncImagePainter.a.b it, InterfaceC1084f interfaceC1084f2, int i12) {
                kotlin.jvm.internal.i.e(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                kotlin.jvm.internal.i.e(it, "it");
                if ((i12 & 14) == 0) {
                    i12 |= interfaceC1084f2.K(SubcomposeAsyncImage) ? 4 : 2;
                }
                if ((i12 & 651) == 130 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(avatarWrapper, j10, j11, SubcomposeAsyncImage.f(androidx.compose.ui.h.a.f13984b, androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0, 0);
                }
            }
        }, interfaceC1084f);
        interfaceC1084f.L(1981535699);
        boolean zI = interfaceC1084f.i(j);
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (zI || objF == obj) {
            objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.avatar.j
                @Override // Ia.l
                public final Object invoke(Object obj2) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$1$lambda$0(j, x10, (AsyncImagePainter.a.c) obj2);
                }
            };
            interfaceC1084f.E(objF);
        }
        Ia.l lVar = (Ia.l) objF;
        interfaceC1084f.D();
        interfaceC1084f.L(1981548379);
        boolean zK = interfaceC1084f.K(h8) | interfaceC1084f.i(j);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == obj) {
            objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.avatar.k
                @Override // Ia.l
                public final Object invoke(Object obj2) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$3$lambda$2(h8, j, x10, (AsyncImagePainter.a.d) obj2);
                }
            };
            interfaceC1084f.E(objF2);
        }
        Ia.l lVar2 = (Ia.l) objF2;
        interfaceC1084f.D();
        interfaceC1084f.L(1981542035);
        boolean zI2 = interfaceC1084f.i(j);
        Object objF3 = interfaceC1084f.f();
        if (zI2 || objF3 == obj) {
            objF3 = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.avatar.l
                @Override // Ia.l
                public final Object invoke(Object obj2) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$5$lambda$4(j, x10, (AsyncImagePainter.a.b) obj2);
                }
            };
            interfaceC1084f.E(objF3);
        }
        interfaceC1084f.D();
        u.a(imageUrl, label, imageLoader, hVarI, composableLambdaImplB, composableLambdaImplB2, lVar, lVar2, (Ia.l) objF3, c0159a, interfaceC1084f, 12780032, 384, 256080);
        interfaceC1084f.J();
        if (this.$isActive) {
            AvatarIconKt.AvatarActiveIndicator(BoxWithConstraints.f(W.m(aVar, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate)), androidx.compose.ui.d.a.f13343i), interfaceC1084f, 0, 0);
        }
    }
}
