package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import coil.request.e;
import coil.request.g;
import coil.request.o;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;
import kotlin.collections.k;

/* JADX INFO: loaded from: classes3.dex */
class LocalImage extends Image implements LocalImageBlock {
    private final Twig twig;

    public LocalImage(StyleType styleType) {
        super(styleType);
        this.twig = LumberMill.getLogger();
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock
    public View addImage(Uri uri, int i10, int i11, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int iDpToPx = ScreenUtils.dpToPx(i10, context);
        int iDpToPx2 = ScreenUtils.dpToPx(i11, context);
        ProgressFrameLayout progressFrameLayout = new ProgressFrameLayout(context);
        BlockUtils.createLayoutParams(progressFrameLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(progressFrameLayout);
        final ResizableImageView resizableImageView = new ResizableImageView(context);
        BlockUtils.createLayoutParams(resizableImageView, -2, -2);
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        progressFrameLayout.addView(resizableImageView);
        g.a aVar = new g.a(context);
        aVar.f(resizableImageView);
        aVar.f23074c = uri;
        setImageViewBounds(iDpToPx, iDpToPx2, resizableImageView, aVar);
        View childAt = progressFrameLayout.getChildAt(0);
        Resources resources = context.getResources();
        if (childAt instanceof UploadProgressBar) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_local_image_upload_size);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            childAt.bringToFront();
            progressFrameLayout.uploadStarted();
        }
        setBackground(resizableImageView);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        resizableImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners);
        aVar.f23080i = coil.util.b.a(k.d0(new p016b3.d[]{new p016b3.c(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2)}));
        aVar.b();
        aVar.f23076e = new g.b() { // from class: io.intercom.android.sdk.blocks.LocalImage.1
            @Override // coil.request.g.b
            public void onError(g gVar, e eVar) {
                LocalImage.this.twig.internal("images", "FAILURE");
            }

            @Override // coil.request.g.b
            public void onSuccess(g gVar, o oVar) {
                LocalImage.this.twig.internal("images", "SUCCESS");
                resizableImageView.setBackgroundResource(android.R.color.transparent);
            }

            @Override // coil.request.g.b
            public void onCancel(g gVar) {
            }

            @Override // coil.request.g.b
            public void onStart(g gVar) {
            }
        };
        IntercomCoilKt.loadIntercomImage(context, aVar.a());
        BlockUtils.setLayoutMarginsAndGravity(progressFrameLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        return progressFrameLayout;
    }
}
