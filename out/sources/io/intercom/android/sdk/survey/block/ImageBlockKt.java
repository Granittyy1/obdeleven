package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import androidx.compose.animation.core.E;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.K;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import coil.compose.AsyncImageKt;
import coil.compose.AsyncImagePainter;
import com.google.accompanist.placeholder.PlaceholderDefaults;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: ImageBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageBlockKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1, reason: invalid class name */
    /* JADX INFO: compiled from: ImageBlock.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Block $block;
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Uri $dataUri;
        final /* synthetic */ androidx.compose.ui.h $modifier;
        final /* synthetic */ Ia.l<Block, p293xa.r> $onClick;
        final /* synthetic */ ImageRenderType $renderType;
        final /* synthetic */ X<AsyncImagePainter.a> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Block block, ImageRenderType imageRenderType, String str, Uri uri, androidx.compose.ui.h hVar, X<AsyncImagePainter.a> x10, Ia.l<? super Block, p293xa.r> lVar) {
            this.$block = block;
            this.$renderType = imageRenderType;
            this.$cacheKey = str;
            this.$dataUri = uri;
            this.$modifier = hVar;
            this.$state$delegate = x10;
            this.$onClick = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.h invoke$lambda$10$lambda$9(float f10, float f11, androidx.compose.ui.h ifTrue) {
            kotlin.jvm.internal.i.e(ifTrue, "$this$ifTrue");
            return W.n(f10, f11, ifTrue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$12(Ia.l lVar, Block block, View currentView, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
            kotlin.jvm.internal.i.e(block, "$block");
            kotlin.jvm.internal.i.e(currentView, "$currentView");
            kotlin.jvm.internal.i.e(fileSavingText, "$fileSavingText");
            kotlin.jvm.internal.i.e(fileSavedText, "$fileSavedText");
            kotlin.jvm.internal.i.e(saveFailedText, "$saveFailedText");
            kotlin.jvm.internal.i.e(permissionDeniedText, "$permissionDeniedText");
            if (lVar != null) {
                lVar.invoke(block);
            } else {
                String linkUrl = block.getLinkUrl();
                kotlin.jvm.internal.i.d(linkUrl, "getLinkUrl(...)");
                if (linkUrl.length() > 0) {
                    LinkOpener.handleUrl(block.getLinkUrl(), currentView.getContext(), Injector.get().getApi());
                } else {
                    Context context = currentView.getContext();
                    IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
                    kotlin.jvm.internal.i.b(context);
                    String url = block.getUrl();
                    kotlin.jvm.internal.i.d(url, "getUrl(...)");
                    List listK = M1.k(new IntercomPreviewFile.NetworkFile(url, "image/*"));
                    String url2 = block.getUrl();
                    kotlin.jvm.internal.i.d(url2, "getUrl(...)");
                    context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listK, null, null, false, new DownloadState(url2.length() > 0, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText), 14, null)));
                }
            }
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$14$lambda$13(X state$delegate, AsyncImagePainter.a it) {
            kotlin.jvm.internal.i.e(state$delegate, "$state$delegate");
            kotlin.jvm.internal.i.e(it, "it");
            ImageBlockKt.ImageBlock$lambda$2(state$delegate, it);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.h invoke$lambda$8$lambda$7(float f10, float f11, androidx.compose.ui.h ifTrue) {
            kotlin.jvm.internal.i.e(ifTrue, "$this$ifTrue");
            return W.p(ifTrue, 0.0f, 0.0f, f10, f11, 3);
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0950j, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            Pair pair;
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
            p013b0.c cVar = (p013b0.c) interfaceC1084f.x(CompositionLocalsKt.f14847h);
            boolean z10 = this.$block.getHeight() > 0 && this.$block.getWidth() > 0;
            ImageRenderType imageRenderType = this.$renderType;
            ImageRenderType imageRenderType2 = ImageRenderType.WITH_MAX_SIZE;
            if (imageRenderType == imageRenderType2 && z10) {
                float fT0 = cVar.T0(268);
                if (this.$block.getWidth() > this.$block.getHeight()) {
                    pair = new Pair(new p013b0.f(cVar.v(fT0)), new p013b0.f(cVar.v(fT0 * ((this.$block.getHeight() * 1.0f) / this.$block.getWidth()))));
                } else {
                    pair = new Pair(new p013b0.f(cVar.v(((this.$block.getWidth() * 1.0f) / this.$block.getHeight()) * fT0)), new p013b0.f(cVar.v(fT0)));
                }
            } else if (imageRenderType == imageRenderType2) {
                float f10 = 268;
                pair = new Pair(new p013b0.f(f10), new p013b0.f(f10));
            } else {
                float fD = BoxWithConstraints.d();
                float fI = this.$renderType == ImageRenderType.FULL ? BoxWithConstraints.i() : 1.5f * fD;
                if (this.$block.getHeight() > 0) {
                    Block block = this.$block;
                    fI = Na.l.z(cVar.u(ImageUtils.getAspectHeight((int) cVar.T0(fD), ImageUtils.getAspectRatio(block.getWidth(), block.getHeight()))), fI);
                }
                pair = new Pair(new p013b0.f(fD), new p013b0.f(fI));
            }
            final float f11 = ((p013b0.f) pair.a()).f20481b;
            final float f12 = ((p013b0.f) pair.b()).f20481b;
            final View view = (View) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14797f);
            float[] fArrA = J.a();
            J.b(0.0f, fArrA);
            final String strP = S4.o.p(interfaceC1084f, R.string.intercom_permission_denied);
            final String strP2 = S4.o.p(interfaceC1084f, R.string.intercom_file_saved);
            final String strP3 = S4.o.p(interfaceC1084f, R.string.intercom_saving);
            final String strP4 = S4.o.p(interfaceC1084f, R.string.intercom_something_went_wrong_try_again);
            O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
            coil.request.g.a aVar = new coil.request.g.a((Context) interfaceC1084f.x(o10));
            String str = this.$cacheKey;
            aVar.f23077f = str != null ? new X2.b.a(str) : null;
            aVar.f23078g = this.$cacheKey;
            aVar.f23074c = this.$dataUri;
            aVar.e((int) cVar.T0(f11), (int) cVar.T0(f12));
            aVar.b();
            aVar.c(R.drawable.intercom_image_load_failed);
            coil.request.g gVarA = aVar.a();
            coil.f imageLoader = IntercomImageLoaderKt.getImageLoader((Context) interfaceC1084f.x(o10));
            interfaceC1084f.L(1738641811);
            String text = this.$block.getText();
            if (kotlin.text.n.S(text)) {
                text = S4.o.p(interfaceC1084f, R.string.intercom_image_attached);
            }
            String str2 = text;
            interfaceC1084f.D();
            androidx.compose.ui.h hVar = this.$modifier;
            boolean z11 = this.$renderType == imageRenderType2 && !z10;
            interfaceC1084f.L(1738649296);
            boolean zG = interfaceC1084f.g(f11) | interfaceC1084f.g(f12);
            Object objF = interfaceC1084f.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zG || objF == c0153a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.m
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return ImageBlockKt.AnonymousClass1.invoke$lambda$8$lambda$7(f11, f12, (androidx.compose.ui.h) obj);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            androidx.compose.ui.h hVarIfTrue = ModifierExtensionsKt.ifTrue(hVar, z11, (Ia.l) objF);
            boolean z12 = this.$renderType != imageRenderType2 || z10;
            interfaceC1084f.L(1738655368);
            boolean zG2 = interfaceC1084f.g(f11) | interfaceC1084f.g(f12);
            Object objF2 = interfaceC1084f.f();
            if (zG2 || objF2 == c0153a) {
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.n
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return ImageBlockKt.AnonymousClass1.invoke$lambda$10$lambda$9(f11, f12, (androidx.compose.ui.h) obj);
                    }
                };
                interfaceC1084f.E(objF2);
            }
            interfaceC1084f.D();
            androidx.compose.ui.h hVarB = C0932d.b(ModifierExtensionsKt.ifTrue(hVarIfTrue, z12, (Ia.l) objF2), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m624getBubbleBackground0d7_KjU(), h0.f13629a);
            boolean z13 = (ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate) instanceof AsyncImagePainter.a.C0239a) || (ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate) instanceof AsyncImagePainter.a.c);
            long jE = Q3.d.e(2499805183L);
            E animationSpec = (E) PlaceholderDefaults.f25223a.getValue();
            kotlin.jvm.internal.i.e(animationSpec, "animationSpec");
            androidx.compose.ui.h hVarA = androidx.compose.foundation.p.a(com.google.accompanist.placeholder.b.b(hVarB, z13, Q3.d.d(869059788), new com.google.accompanist.placeholder.c(jE, animationSpec, 0.6f)), true, null);
            final Ia.l<Block, p293xa.r> lVar = this.$onClick;
            final Block block2 = this.$block;
            K k10 = null;
            androidx.compose.ui.h hVarC = ClickableKt.c(hVarA, false, null, new Ia.a() { // from class: io.intercom.android.sdk.survey.block.o
                @Override // Ia.a
                public final Object invoke() {
                    return ImageBlockKt.AnonymousClass1.invoke$lambda$12(lVar, block2, view, strP3, strP2, strP4, strP);
                }
            }, 7);
            InterfaceC1161g interfaceC1161g = this.$renderType == ImageRenderType.CROPPED ? InterfaceC1161g.a.f14243a : InterfaceC1161g.a.f14244b;
            if (ImageBlockKt.getHasUri(this.$block)) {
                K k11 = new K(new ColorMatrixColorFilter(fArrA));
                k11.f13508b = fArrA;
                k10 = k11;
            }
            interfaceC1084f.L(1738644608);
            final X<AsyncImagePainter.a> x10 = this.$state$delegate;
            Object objF3 = interfaceC1084f.f();
            if (objF3 == c0153a) {
                objF3 = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.p
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return ImageBlockKt.AnonymousClass1.invoke$lambda$14$lambda$13(x10, (AsyncImagePainter.a) obj);
                    }
                };
                interfaceC1084f.E(objF3);
            }
            interfaceC1084f.D();
            AsyncImageKt.b(gVarA, str2, imageLoader, hVarC, (Ia.l) objF3, interfaceC1161g, k10, interfaceC1084f, 197128, 7504);
        }
    }

    public static final void ImageBlock(final Block block, androidx.compose.ui.h hVar, Ia.l<? super Block, p293xa.r> lVar, boolean z10, ImageRenderType imageRenderType, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        Uri localUri;
        String previewUrl;
        kotlin.jvm.internal.i.e(block, "block");
        C1086g c1086gP = interfaceC1084f.p(-762701011);
        androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Ia.l<? super Block, p293xa.r> lVar2 = (i11 & 4) != 0 ? null : lVar;
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        ImageRenderType imageRenderType2 = (i11 & 16) != 0 ? ImageRenderType.CROPPED : imageRenderType;
        boolean z12 = (getHasUri(block) || !z11 || (previewUrl = block.getPreviewUrl()) == null || previewUrl.length() == 0) ? false : true;
        if (getHasUri(block)) {
            localUri = block.getLocalUri();
        } else if (z12) {
            localUri = Uri.parse(block.getPreviewUrl());
        } else {
            String url = block.getUrl();
            if (url == null) {
                url = "";
            }
            localUri = Uri.parse(url);
        }
        Uri uri = localUri;
        String path = uri.getPath();
        c1086gP.L(2072019078);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = J0.f(AsyncImagePainter.a.C0239a.f22727a);
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        BoxWithConstraintsKt.a(hVar2, null, false, androidx.compose.runtime.internal.a.b(-179054825, new AnonymousClass1(block, imageRenderType2, path, uri, hVar2, (X) objF, lVar2), c1086gP), c1086gP, ((i10 >> 3) & 14) | 3072, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final Ia.l<? super Block, p293xa.r> lVar3 = lVar2;
            final boolean z13 = z11;
            final ImageRenderType imageRenderType3 = imageRenderType2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ImageBlockKt.ImageBlock$lambda$3(block, hVar3, lVar3, z13, imageRenderType3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncImagePainter.a ImageBlock$lambda$1(X<AsyncImagePainter.a> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageBlock$lambda$2(X<AsyncImagePainter.a> x10, AsyncImagePainter.a aVar) {
        x10.setValue(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ImageBlock$lambda$3(Block block, androidx.compose.ui.h hVar, Ia.l lVar, boolean z10, ImageRenderType imageRenderType, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(block, "$block");
        ImageBlock(block, hVar, lVar, z10, imageRenderType, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasUri(Block block) {
        return (block.getLocalUri() == null || kotlin.jvm.internal.i.a(block.getLocalUri(), Uri.EMPTY)) ? false : true;
    }
}
