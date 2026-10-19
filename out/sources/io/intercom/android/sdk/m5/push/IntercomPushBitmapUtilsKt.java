package io.intercom.android.sdk.m5.push;

import Ia.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.FileProvider;
import coil.request.g;
import com.voltasit.obdeleven.domain.usecases.device.v;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.collections.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.z0;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: IntercomPushBitmapUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushBitmapUtilsKt {
    private static final float BIG_PICTURE_HEIGHT_DP = 256.0f;
    private static final float BIG_PICTURE_WIDTH_DP = 512.0f;
    private static final float LARGE_ICON_SIZE_DP = 48.0f;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomPushBitmapUtils.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1", f = "IntercomPushBitmapUtils.kt", l = {R.styleable.AppCompatTheme_colorError, R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ AppConfig $appConfig;
        final /* synthetic */ String $authorName;
        final /* synthetic */ Ref$ObjectRef<Bitmap> $avatarBitmap;
        final /* synthetic */ String $avatarImageUrl;
        final /* synthetic */ Ref$ObjectRef<Bitmap> $contentBitmap;
        final /* synthetic */ String $contentImageUrl;
        final /* synthetic */ Context $context;
        final /* synthetic */ p<Bitmap, Bitmap, r> $onComplete;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p<? super Bitmap, ? super Bitmap, r> pVar, Ref$ObjectRef<Bitmap> ref$ObjectRef, Ref$ObjectRef<Bitmap> ref$ObjectRef2, Context context, String str, String str2, String str3, AppConfig appConfig, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onComplete = pVar;
            this.$contentBitmap = ref$ObjectRef;
            this.$avatarBitmap = ref$ObjectRef2;
            this.$context = context;
            this.$contentImageUrl = str;
            this.$avatarImageUrl = str2;
            this.$authorName = str3;
            this.$appConfig = appConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onComplete, this.$contentBitmap, this.$avatarBitmap, this.$context, this.$contentImageUrl, this.$avatarImageUrl, this.$authorName, this.$appConfig, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC2694i0 interfaceC2694i0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC2694i0 = (InterfaceC2694i0) this.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    this.$onComplete.invoke(this.$contentBitmap.element, this.$avatarBitmap.element);
                    return r.f47939a;
                }
                kotlin.b.b(obj);
                A a10 = (A) this.L$0;
                z0 z0VarC = C2680e.c(a10, null, null, new IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(this.$contentBitmap, this.$context, this.$contentImageUrl, null), 3);
                z0 z0VarC2 = C2680e.c(a10, null, null, new IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1(this.$avatarBitmap, this.$context, this.$avatarImageUrl, this.$authorName, this.$appConfig, null), 3);
                this.L$0 = z0VarC2;
                this.label = 1;
                if (z0VarC.C(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2694i0 = z0VarC2;
                this.L$0 = null;
                this.label = 2;
                if (interfaceC2694i0.C(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.$onComplete.invoke(this.$contentBitmap.element, this.$avatarBitmap.element);
                return r.f47939a;
            } catch (Throwable th) {
                this.$onComplete.invoke(this.$contentBitmap.element, this.$avatarBitmap.element);
                throw th;
            }
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public static final Uri getBitmapUri(Context context, Bitmap bitmap) {
        i.e(context, "context");
        i.e(bitmap, "bitmap");
        try {
            File file = new File(context.getCacheDir(), "images");
            file.mkdirs();
            String string = UUID.randomUUID().toString();
            i.d(string, "toString(...)");
            File file2 = new File(file, string.concat(".png"));
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap loadAvatarBitmapBlocking(Context context, String str, String str2, AppConfig appConfig) {
        Drawable drawableLoadIntercomImageBlocking;
        if (n.S(str) && n.S(str2)) {
            return null;
        }
        int iDpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_DP, context);
        if (!n.S(str) || n.S(str2)) {
            AvatarDefaultDrawable defaultDrawable = AvatarUtils.getDefaultDrawable(context, appConfig);
            g.a aVar = new g.a(context);
            aVar.f23092v = defaultDrawable;
            aVar.f23091u = 0;
            aVar.f23080i = coil.util.b.a(k.d0(new p016b3.d[]{new p016b3.b()}));
            aVar.f23074c = str;
            Sa.a aVar2 = N.f43200c;
            aVar.f23085o = aVar2;
            aVar.f23086p = aVar2;
            aVar.f23087q = aVar2;
            aVar.e(iDpToPx, iDpToPx);
            drawableLoadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, aVar.a());
            if (drawableLoadIntercomImageBlocking == null) {
                drawableLoadIntercomImageBlocking = defaultDrawable;
            }
        } else {
            drawableLoadIntercomImageBlocking = AvatarUtils.getInitialsDrawable(NameUtils.getInitial(str2), appConfig);
        }
        i.b(drawableLoadIntercomImageBlocking);
        return BitmapUtilsKt.drawableToBitmap(drawableLoadIntercomImageBlocking, iDpToPx, iDpToPx);
    }

    public static final void loadBitmaps(Context context, String contentImageUrl, String avatarImageUrl, String authorName, p<? super Bitmap, ? super Bitmap, r> onComplete) {
        i.e(context, "context");
        i.e(contentImageUrl, "contentImageUrl");
        i.e(avatarImageUrl, "avatarImageUrl");
        i.e(authorName, "authorName");
        i.e(onComplete, "onComplete");
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        C2680e.c(C2673a0.f43223b, N.f43200c, null, new AnonymousClass1(onComplete, new Ref$ObjectRef(), new Ref$ObjectRef(), context, contentImageUrl, avatarImageUrl, authorName, appConfig, null), 2);
    }

    public static /* synthetic */ void loadBitmaps$default(Context context, String str, String str2, String str3, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        loadBitmaps(context, str, str2, str3, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap loadContentBitmapBlocking(Context context, String str) {
        if (n.S(str)) {
            return null;
        }
        int iDpToPx = ScreenUtils.dpToPx(BIG_PICTURE_WIDTH_DP, context);
        int iDpToPx2 = ScreenUtils.dpToPx(BIG_PICTURE_HEIGHT_DP, context);
        Drawable drawableE = v.e(context, io.intercom.android.sdk.R.drawable.intercom_push_image_load_failes);
        g.a aVar = new g.a(context);
        Sa.a aVar2 = N.f43200c;
        aVar.f23085o = aVar2;
        aVar.f23086p = aVar2;
        aVar.f23087q = aVar2;
        aVar.f23074c = str;
        aVar.f23092v = drawableE;
        aVar.f23091u = 0;
        Drawable drawableLoadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, aVar.a());
        if (drawableLoadIntercomImageBlocking != null) {
            drawableE = drawableLoadIntercomImageBlocking;
        }
        if (drawableE != null) {
            return BitmapUtilsKt.drawableToBitmap(drawableE, iDpToPx, iDpToPx2);
        }
        return null;
    }
}
