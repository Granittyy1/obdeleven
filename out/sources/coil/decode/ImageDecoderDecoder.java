package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.PostProcessor;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2683f0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.q0;
import me.zhanghai.android.materialprogressbar.R;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: ImageDecoderDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageDecoderDecoder implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22866c;

    /* JADX INFO: compiled from: ImageDecoderDecoder.kt */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22867a = true;

        @Override // coil.decode.d.a
        public final d create(coil.fetch.l lVar, coil.request.k kVar, coil.f fVar) {
            InterfaceC2841h interfaceC2841hI = lVar.f22989a.i();
            if (!interfaceC2841hI.c0(0L, k.f22891b) && !interfaceC2841hI.c0(0L, k.f22890a) && (!interfaceC2841hI.c0(0L, k.f22892c) || !interfaceC2841hI.c0(8L, k.f22893d) || !interfaceC2841hI.c0(12L, k.f22894e) || !interfaceC2841hI.g(17L) || ((byte) (interfaceC2841hI.f().p(16L) & 2)) <= 0)) {
                if (Build.VERSION.SDK_INT < 30 || !interfaceC2841hI.c0(4L, k.f22895f)) {
                    return null;
                }
                if (!interfaceC2841hI.c0(8L, k.f22896g) && !interfaceC2841hI.c0(8L, k.f22897h) && !interfaceC2841hI.c0(8L, k.f22898i)) {
                    return null;
                }
            }
            return new ImageDecoderDecoder(lVar.f22989a, kVar, this.f22867a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    /* JADX INFO: compiled from: ImageDecoder.kt */
    public static final class b implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f22868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageDecoderDecoder f22869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f22870c;

        public b(Ref$ObjectRef ref$ObjectRef, ImageDecoderDecoder imageDecoderDecoder, Ref$BooleanRef ref$BooleanRef) {
            this.f22868a = ref$ObjectRef;
            this.f22869b = imageDecoderDecoder;
            this.f22870c = ref$BooleanRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.f22868a.element = imageDecoder;
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            coil.request.k kVar = this.f22869b.f22865b;
            Z2.e eVar = kVar.f23101d;
            Z2.e eVar2 = Z2.e.f7731c;
            int iA = kotlin.jvm.internal.i.a(eVar, eVar2) ? width : coil.util.f.a(eVar.f7732a, kVar.f23102e);
            coil.request.k kVar2 = this.f22869b.f22865b;
            Z2.e eVar3 = kVar2.f23101d;
            int iA2 = kotlin.jvm.internal.i.a(eVar3, eVar2) ? height : coil.util.f.a(eVar3.f7733b, kVar2.f23102e);
            if (width > 0 && height > 0 && (width != iA || height != iA2)) {
                double dG = A0.f.g(width, height, iA, iA2, this.f22869b.f22865b.f23102e);
                Ref$BooleanRef ref$BooleanRef = this.f22870c;
                boolean z10 = dG < 1.0d;
                ref$BooleanRef.element = z10;
                if (z10 || !this.f22869b.f22865b.f23103f) {
                    imageDecoder.setTargetSize(Ka.a.a(((double) width) * dG), Ka.a.a(dG * ((double) height)));
                }
            }
            coil.request.k kVar3 = this.f22869b.f22865b;
            imageDecoder.setAllocator(kVar3.f23099b == Bitmap.Config.HARDWARE ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!kVar3.f23104g ? 1 : 0);
            ColorSpace colorSpace = kVar3.f23100c;
            if (colorSpace != null) {
                imageDecoder.setTargetColorSpace(colorSpace);
            }
            imageDecoder.setUnpremultipliedRequired(!kVar3.f23105h);
            final p016b3.a aVar = (p016b3.a) kVar3.f23108l.e("coil#animated_transformation");
            imageDecoder.setPostProcessor(aVar != null ? new PostProcessor() { // from class: coil.util.c
                @Override // android.graphics.PostProcessor
                public final int onPostProcess(Canvas canvas) {
                    int iOrdinal = aVar.transform(canvas).ordinal();
                    if (iOrdinal == 0) {
                        return 0;
                    }
                    if (iOrdinal == 1) {
                        return -3;
                    }
                    if (iOrdinal == 2) {
                        return -1;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } : 0);
        }
    }

    /* JADX INFO: renamed from: coil.decode.ImageDecoderDecoder$decode$1, reason: invalid class name */
    /* JADX INFO: compiled from: ImageDecoderDecoder.kt */
    @Aa.c(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {R.styleable.AppCompatTheme_colorAccent, R.styleable.AppCompatTheme_popupWindowStyle}, m = "decode")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageDecoderDecoder.this.decode(this);
        }
    }

    public ImageDecoderDecoder(x xVar, coil.request.k kVar, boolean z10) {
        this.f22864a = xVar;
        this.f22865b = kVar;
        this.f22866c = z10;
    }

    public final ImageDecoder.Source a(x xVar) {
        p318zb.z zVarC = xVar.c();
        if (zVarC != null) {
            return ImageDecoder.createSource(zVarC.e());
        }
        x.a aVarH = xVar.h();
        boolean z10 = aVarH instanceof C1554a;
        coil.request.k kVar = this.f22865b;
        if (z10) {
            return ImageDecoder.createSource(kVar.f23098a.getAssets(), ((C1554a) aVarH).f22871a);
        }
        if (aVarH instanceof C1555b) {
            return ImageDecoder.createSource(kVar.f23098a.getContentResolver(), ((C1555b) aVarH).f22872a);
        }
        if (aVarH instanceof z) {
            z zVar = (z) aVarH;
            if (kotlin.jvm.internal.i.a(zVar.f22910a, kVar.f23098a.getPackageName())) {
                return ImageDecoder.createSource(kVar.f23098a.getResources(), zVar.f22911b);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return ImageDecoder.createSource(xVar.i().A());
        }
        return i10 == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(xVar.i().A())) : ImageDecoder.createSource(xVar.b().e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Drawable drawable, ContinuationImpl continuationImpl) {
        ImageDecoderDecoder$wrapDrawable$1 imageDecoderDecoder$wrapDrawable$1;
        ImageDecoderDecoder imageDecoderDecoder;
        if (continuationImpl instanceof ImageDecoderDecoder$wrapDrawable$1) {
            imageDecoderDecoder$wrapDrawable$1 = (ImageDecoderDecoder$wrapDrawable$1) continuationImpl;
            int i10 = imageDecoderDecoder$wrapDrawable$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                imageDecoderDecoder$wrapDrawable$1.label = i10 - Integer.MIN_VALUE;
            } else {
                imageDecoderDecoder$wrapDrawable$1 = new ImageDecoderDecoder$wrapDrawable$1(this, continuationImpl);
            }
        } else {
            imageDecoderDecoder$wrapDrawable$1 = new ImageDecoderDecoder$wrapDrawable$1(this, continuationImpl);
        }
        Object obj = imageDecoderDecoder$wrapDrawable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = imageDecoderDecoder$wrapDrawable$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            if (!r.b(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableA = androidx.activity.t.a(drawable);
            coil.request.k kVar = this.f22865b;
            Integer num = (Integer) kVar.f23108l.e("coil#repeat_count");
            animatedImageDrawableA.setRepeatCount(num != null ? num.intValue() : -1);
            coil.request.l lVar = kVar.f23108l;
            Ia.a aVar = (Ia.a) lVar.e("coil#animation_start_callback");
            Ia.a aVar2 = (Ia.a) lVar.e("coil#animation_end_callback");
            if (aVar != null || aVar2 != null) {
                Sa.b bVar = N.f43198a;
                q0 q0VarD1 = kotlinx.coroutines.internal.q.f43500a.d1();
                ImageDecoderDecoder$wrapDrawable$2 imageDecoderDecoder$wrapDrawable$2 = new ImageDecoderDecoder$wrapDrawable$2(drawable, aVar, aVar2, null);
                imageDecoderDecoder$wrapDrawable$1.L$0 = this;
                imageDecoderDecoder$wrapDrawable$1.L$1 = drawable;
                imageDecoderDecoder$wrapDrawable$1.label = 1;
                if (C2680e.f(q0VarD1, imageDecoderDecoder$wrapDrawable$2, imageDecoderDecoder$wrapDrawable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            imageDecoderDecoder = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = (Drawable) imageDecoderDecoder$wrapDrawable$1.L$1;
            imageDecoderDecoder = (ImageDecoderDecoder) imageDecoderDecoder$wrapDrawable$1.L$0;
            kotlin.b.b(obj);
        }
        return new U2.d(drawable, imageDecoderDecoder.f22865b.f23102e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.decode.d
    public final Object decode(kotlin.coroutines.c<? super c> cVar) {
        AnonymousClass1 anonymousClass1;
        ImageDecoderDecoder imageDecoderDecoder;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1((ContinuationImpl) cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1((ContinuationImpl) cVar);
        }
        Object objB = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ref$BooleanRef = (Ref$BooleanRef) anonymousClass1.L$1;
                imageDecoderDecoder = (ImageDecoderDecoder) anonymousClass1.L$0;
                kotlin.b.b(objB);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef2 = (Ref$BooleanRef) anonymousClass1.L$0;
                kotlin.b.b(objB);
            }
            return new c((Drawable) objB, ref$BooleanRef2.element);
        }
        kotlin.b.b(objB);
        Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        t tVar = new t(this, 0, ref$BooleanRef3);
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = ref$BooleanRef3;
        anonymousClass1.label = 1;
        Object objA = C2683f0.a(tVar, anonymousClass1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        imageDecoderDecoder = this;
        ref$BooleanRef = ref$BooleanRef3;
        objB = objA;
        anonymousClass1.L$0 = ref$BooleanRef;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        objB = imageDecoderDecoder.b((Drawable) objB, anonymousClass1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$BooleanRef2 = ref$BooleanRef;
        return new c((Drawable) objB, ref$BooleanRef2.element);
    }
}
