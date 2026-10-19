package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import coil.request.e;
import coil.request.g;
import coil.request.l;
import coil.request.o;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.coil.GrayscaleTransformation;
import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import kotlin.collections.k;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkImage extends Image implements ImageBlock {
    private final ImageClickListener listener;
    private final Twig twig;
    private final UploadingImageCache uploadingImageCache;

    public NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache, ImageClickListener imageClickListener) {
        super(styleType);
        this.twig = LumberMill.getLogger();
        this.uploadingImageCache = uploadingImageCache;
        this.listener = imageClickListener;
    }

    private void loadImageFromUrl(final String str, final String str2, final Context context, final int i10, final int i11, final ResizableImageView resizableImageView, final p300y4.d dVar) {
        if (TextUtils.isEmpty(str)) {
            hideLoadingState(dVar, resizableImageView);
            resizableImageView.setImageResource(R.drawable.intercom_image_load_failed);
            resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        g.a aVar = new g.a(context);
        aVar.c(R.drawable.intercom_image_load_failed);
        aVar.b();
        aVar.f(resizableImageView);
        aVar.f23074c = str;
        setImageViewBounds(i10, i11, resizableImageView, aVar);
        Resources resources = context.getResources();
        if (getStyle() != StyleType.CAROUSEL) {
            if (ImageUtils.isGif(str)) {
                RoundedCornersAnimatedTransformation roundedCornersAnimatedTransformation = new RoundedCornersAnimatedTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners));
                String string = roundedCornersAnimatedTransformation.toString();
                l.a aVar2 = aVar.f23088r;
                if (aVar2 == null) {
                    aVar2 = new l.a();
                    aVar.f23088r = aVar2;
                }
                aVar2.f23114a.put("coil#animated_transformation", new l.b(roundedCornersAnimatedTransformation, string));
            } else {
                float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners);
                aVar.f23080i = coil.util.b.a(k.d0(new p016b3.d[]{new p016b3.c(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize)}));
            }
        }
        Uri localImageUriForRemoteUrl = this.uploadingImageCache.getLocalImageUriForRemoteUrl(str);
        if (localImageUriForRemoteUrl != null) {
            aVar.f23080i = coil.util.b.a(k.d0(new p016b3.d[]{new GrayscaleTransformation()}));
            aVar.f23074c = localImageUriForRemoteUrl;
        }
        aVar.f23076e = new g.b() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1
            @Override // coil.request.g.b
            public void onError(g gVar, e eVar) {
                ResizableImageView resizableImageView2 = resizableImageView;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                resizableImageView2.setScaleType(scaleType);
                NetworkImage.this.hideLoadingState(dVar, resizableImageView);
                NetworkImage.this.twig.internal("images", "FAILURE");
                resizableImageView.setScaleType(scaleType);
            }

            @Override // coil.request.g.b
            public void onSuccess(g gVar, o oVar) {
                NetworkImage.this.twig.internal("images", "SUCCESS");
                NetworkImage.this.hideLoadingState(dVar, resizableImageView);
                if (NetworkImage.this.getStyle() == StyleType.CHAT_FULL || NetworkImage.this.listener == null) {
                    return;
                }
                resizableImageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        ImageClickListener imageClickListener = NetworkImage.this.listener;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        imageClickListener.onImageClicked(str, str2, resizableImageView, i10, i11);
                    }
                });
            }

            @Override // coil.request.g.b
            public void onCancel(g gVar) {
            }

            @Override // coil.request.g.b
            public void onStart(g gVar) {
            }
        };
        IntercomCoilKt.loadIntercomImage(context, aVar.a());
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock
    public View addImage(String str, String str2, String str3, int i10, int i11, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int iDpToPx = ScreenUtils.dpToPx(i10, context);
        int iDpToPx2 = ScreenUtils.dpToPx(i11, context);
        p300y4.d intercomShimmerLayout = new IntercomShimmerLayout(context);
        BlockUtils.createLayoutParams(intercomShimmerLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(intercomShimmerLayout);
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setTransitionName(LightBoxActivity.TRANSITION_KEY);
        resizableImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        setBackground(resizableImageView);
        intercomShimmerLayout.addView(resizableImageView);
        loadImageFromUrl(str, str2, context, iDpToPx, iDpToPx2, resizableImageView, intercomShimmerLayout);
        BlockUtils.setLayoutMarginsAndGravity(intercomShimmerLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(resizableImageView);
        } else if (!TextUtils.isEmpty(str3)) {
            resizableImageView.setFocusable(true);
            resizableImageView.setContentDescription(str3);
        }
        return intercomShimmerLayout;
    }

    public int getSampleSize(int i10, int i11, DisplayMetrics displayMetrics) {
        int i12 = displayMetrics.widthPixels;
        if (i10 > i12 || i11 > displayMetrics.heightPixels) {
            return (int) Math.pow(2.0d, (int) Math.ceil(Math.log(((double) i12) / ((double) Math.max(i11, i10))) / Math.log(0.5d)));
        }
        return 1;
    }

    public void hideLoadingState(p300y4.d dVar, ImageView imageView) {
        if (dVar != null) {
            dVar.hideShimmer();
            imageView.setBackgroundResource(android.R.color.transparent);
        }
    }
}
