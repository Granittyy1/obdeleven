package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import coil.request.g;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import p293xa.r;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationRatingCard implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private ConversationRating conversationRating;
    private LinearLayout rootLayout;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIndexOf = ConversationRatingCard.this.ratingViews.indexOf(view);
            if (iIndexOf == -1 || ConversationRatingCard.this.ratingViews.size() != ConversationRatingCard.this.conversationRating.getOptions().size()) {
                return;
            }
            ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
            conversationRatingCard.rateConversation(conversationRatingCard.conversationRating, ConversationRatingCard.this.conversationRating.getOptions().get(iIndexOf));
            ConversationRatingCard.this.updateSelectedRating();
        }
    };
    private final List<ImageView> ratingViews = new ArrayList();
    private final ColorFilter deselectedFilter = ColorUtils.newGreyscaleFilter();

    public ConversationRatingCard(Api api, String str, Provider<AppConfig> provider) {
        this.api = api;
        this.conversationId = str;
        this.appConfigProvider = provider;
    }

    private View createConversationRatingBlock(ConversationRating conversationRating, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.ratingViews.clear();
        this.conversationRating = conversationRating;
        this.rootLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        updateViewVisibility();
        IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        intercomPrimaryButton.setText(context.getString(R.string.intercom_tell_us_more));
        intercomPrimaryButton.setOnClick(new a(this, context, 0));
        setupRatingsLayout();
        updateSelectedRating();
        return this.rootLayout;
    }

    private void deselectView(ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(DESELECTED_RATING_SCALE).scaleY(DESELECTED_RATING_SCALE).setDuration(ANIMATION_DURATION_MS).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    private ConversationRatingOption findSelectedOption() {
        for (ConversationRatingOption conversationRatingOption : this.conversationRating.getOptions()) {
            if (conversationRatingOption.getIndex().equals(this.conversationRating.getRatingIndex())) {
                return conversationRatingOption;
            }
        }
        return null;
    }

    private static String imageUrlForUnicode(String str) {
        return androidx.compose.foundation.gestures.d.b("https://js.intercomcdn.com/images/stickers/", str, ".png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r lambda$createConversationRatingBlock$0(Context context) {
        showRemarkDialog(context);
        return null;
    }

    private void selectView(float f10, ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f10).scaleY(f10).setDuration(ANIMATION_DURATION_MS).start();
        imageView.clearColorFilter();
    }

    private void setupRatingsLayout() {
        LinearLayout linearLayout = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        Context context = this.rootLayout.getContext();
        int iDpToPx = ScreenUtils.dpToPx(RATING_VERTICAL_PADDING, context);
        int iDpToPx2 = ScreenUtils.dpToPx(RATING_HORIZONTAL_PADDING, context);
        for (int i10 = 0; i10 < this.conversationRating.getOptions().size(); i10++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i10);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, DESELECTED_RATING_SCALE));
            ImageView imageView = new ImageView(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intercom_conversation_rating_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
            layoutParams.setMargins(iDpToPx2, iDpToPx, iDpToPx2, iDpToPx);
            imageView.setLayoutParams(layoutParams);
            imageView.setLongClickable(false);
            String strImageUrlForUnicode = imageUrlForUnicode(conversationRatingOption.getUnicode());
            g.a aVar = new g.a(context);
            aVar.f23074c = strImageUrlForUnicode;
            aVar.f(imageView);
            IntercomCoilKt.loadIntercomImage(context, aVar.a());
            imageView.setOnClickListener(this.ratingClickListener);
            frameLayout.addView(imageView);
            linearLayout.addView(frameLayout);
            this.ratingViews.add(imageView);
        }
    }

    private void showRemarkDialog(Context context) {
        e.a aVar = new e.a(context);
        aVar.setTitle(R.string.intercom_tell_us_more);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iDpToPx = ScreenUtils.dpToPx(DIALOG_HORIZONTAL_MARGIN, context);
        layoutParams.setMargins(iDpToPx, 0, iDpToPx, 0);
        final EditText editText = new EditText(context);
        editText.getBackground().mutate().setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_ATOP);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        aVar.setView(linearLayout);
        aVar.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                String string = editText.getText().toString();
                ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
                conversationRatingCard.addRemarkToConversation(conversationRatingCard.conversationRating, string);
            }
        });
        aVar.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.cancel();
            }
        });
        final e eVarCreate = aVar.create();
        eVarCreate.show();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z10) {
                if (!z10 || eVarCreate.getWindow() == null) {
                    return;
                }
                eVarCreate.getWindow().setSoftInputMode(5);
            }
        });
        eVarCreate.f(-1).setTextColor(this.appConfigProvider.get().getPrimaryColor());
        eVarCreate.f(-2).setTextColor(this.appConfigProvider.get().getPrimaryColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectedRating() {
        if (this.conversationRating.getOptions().size() != this.ratingViews.size()) {
            return;
        }
        for (int i10 = 0; i10 < this.conversationRating.getOptions().size(); i10++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i10);
            ImageView imageView = this.ratingViews.get(i10);
            if (this.conversationRating.getRatingIndex().intValue() == -1) {
                selectView(DESELECTED_RATING_SCALE, imageView);
            } else if (this.conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
                selectView(SELECTED_RATING_SCALE, imageView);
            } else {
                deselectView(imageView);
            }
        }
    }

    private void updateViewVisibility() {
        if (this.rootLayout == null) {
            return;
        }
        boolean z10 = this.conversationRating.getRatingIndex().intValue() != -1;
        boolean zIsEmpty = TextUtils.isEmpty(this.conversationRating.getRemark());
        ((TextView) this.rootLayout.findViewById(R.id.rate_your_conversation_text_view)).setVisibility(!zIsEmpty ? 8 : 0);
        ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout)).setVisibility(!zIsEmpty ? 8 : 0);
        ((IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button)).setVisibility((z10 && zIsEmpty) ? 0 : 8);
        ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_you_rated_layout)).setVisibility(zIsEmpty ? 8 : 0);
        ConversationRatingOption conversationRatingOptionFindSelectedOption = findSelectedOption();
        if (conversationRatingOptionFindSelectedOption != null) {
            ImageView imageView = (ImageView) this.rootLayout.findViewById(R.id.intercom_you_rated_image_view);
            String strImageUrlForUnicode = imageUrlForUnicode(conversationRatingOptionFindSelectedOption.getUnicode());
            g.a aVar = new g.a(imageView.getContext());
            aVar.f23074c = strImageUrlForUnicode;
            aVar.f(imageView);
            IntercomCoilKt.loadIntercomImage(imageView.getContext(), aVar.a());
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock
    public View addConversationRatingBlock(ConversationRating conversationRating, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        return createConversationRatingBlock(conversationRating, viewGroup);
    }

    public void addRemarkToConversation(ConversationRating conversationRating, String str) {
        if (TextUtils.isEmpty(conversationRating.getRemark())) {
            conversationRating.setRemark(str);
            this.api.addConversationRatingRemark(this.conversationId, str);
            updateViewVisibility();
        }
    }

    public void rateConversation(ConversationRating conversationRating, ConversationRatingOption conversationRatingOption) {
        if (conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
            return;
        }
        conversationRating.setRatingIndex(conversationRatingOption.getIndex().intValue());
        this.api.rateConversation(this.conversationId, conversationRatingOption.getIndex().intValue());
        updateViewVisibility();
    }
}
