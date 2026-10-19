package io.intercom.android.sdk.ui.coil;

import Aa.c;
import Ka.a;
import Z2.e;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import coil.decode.d;
import coil.decode.x;
import coil.f;
import coil.fetch.l;
import coil.request.k;
import coil.size.Scale;
import io.intercom.android.sdk.g;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2683f0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PdfDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PdfDecoder implements d {
    public static final int $stable = 8;
    private final k options;
    private final x source;

    /* JADX INFO: compiled from: PdfDecoder.kt */
    public static final class Factory implements d.a {
        public static final int $stable = 0;

        private final boolean isApplicable(String str) {
            if (str != null) {
                return ContentTypeExtensionKt.isPdf(str);
            }
            return false;
        }

        @Override // coil.decode.d.a
        public d create(l result, k options, f imageLoader) {
            i.e(result, "result");
            i.e(options, "options");
            i.e(imageLoader, "imageLoader");
            if (isApplicable(result.f22990b)) {
                return new PdfDecoder(result.f22989a, options);
            }
            return null;
        }

        public boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1, reason: invalid class name */
    /* JADX INFO: compiled from: PdfDecoder.kt */
    @c(c = "io.intercom.android.sdk.ui.coil.PdfDecoder", f = "PdfDecoder.kt", l = {R.styleable.AppCompatTheme_actionOverflowButtonStyle}, m = "decode")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfDecoder.this.decode(this);
        }
    }

    public PdfDecoder(x source, k options) {
        i.e(source, "source");
        i.e(options, "options");
        this.source = source;
        this.options = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDrawable decode$lambda$2(PdfDecoder this$0, Ref$BooleanRef isSampled) throws Throwable {
        i.e(this$0, "this$0");
        i.e(isSampled, "$isSampled");
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(this$0.source.b().e(), 268435456);
            try {
                PdfRenderer.Page pageOpenPage = new PdfRenderer(parcelFileDescriptorOpen).openPage(0);
                i.d(pageOpenPage, "openPage(...)");
                int width = pageOpenPage.getWidth();
                int height = pageOpenPage.getHeight();
                k kVar = this$0.options;
                e eVar = kVar.f23101d;
                Scale scale = kVar.f23102e;
                e eVar2 = e.f7731c;
                int px = i.a(eVar, eVar2) ? width : PdfDecoderKt.toPx(eVar.f7732a, scale);
                k kVar2 = this$0.options;
                e eVar3 = kVar2.f23101d;
                int px2 = i.a(eVar3, eVar2) ? height : PdfDecoderKt.toPx(eVar3.f7733b, kVar2.f23102e);
                if (width > 0 && height > 0 && (width != px || height != px2)) {
                    double dG = A0.f.g(width, height, px, px2, this$0.options.f23102e);
                    boolean z10 = dG < 1.0d;
                    isSampled.element = z10;
                    if (z10 || !this$0.options.f23103f) {
                        width = a.a(((double) width) * dG);
                        height = a.a(dG * ((double) height));
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                i.d(bitmapCreateBitmap, "createBitmap(...)");
                new Canvas(bitmapCreateBitmap).drawColor(-1);
                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                Resources resources = this$0.options.f23098a.getResources();
                i.d(resources, "getResources(...)");
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                return bitmapDrawable;
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptor = parcelFileDescriptorOpen;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.decode.d
    public Object decode(kotlin.coroutines.c<? super coil.decode.c> cVar) {
        AnonymousClass1 anonymousClass1;
        Ref$BooleanRef ref$BooleanRef;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            g gVar = new g(this, 2, ref$BooleanRef2);
            anonymousClass1.L$0 = ref$BooleanRef2;
            anonymousClass1.label = 1;
            Object objA = C2683f0.a(gVar, anonymousClass1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$BooleanRef = ref$BooleanRef2;
            obj = objA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = (Ref$BooleanRef) anonymousClass1.L$0;
            b.b(obj);
        }
        return new coil.decode.c((BitmapDrawable) obj, ref$BooleanRef.element);
    }
}
