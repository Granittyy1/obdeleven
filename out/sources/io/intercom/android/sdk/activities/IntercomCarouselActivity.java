package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.r;
import androidx.appcompat.app.e;
import androidx.compose.animation.k;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import androidx.viewpager.widget.ViewPager;
import com.intercom.twig.Twig;
import com.voltasit.obdeleven.ui.activity.n;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.carousel.CarouselListener;
import io.intercom.android.sdk.carousel.CarouselPresenter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.carousel.CarouselScreenPagerAdapter;
import io.intercom.android.sdk.carousel.CarouselView;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequest;
import io.intercom.android.sdk.carousel.permission.PermissionRequestFactory;
import io.intercom.android.sdk.carousel.permission.PermissionResultListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p186p0.a;
import p222s0.b;
import p300y4.d;

/* JADX INFO: loaded from: classes3.dex */
public class IntercomCarouselActivity extends IntercomBaseActivity implements ViewPager.i, View.OnClickListener, CarouselListener, PermissionResultListener, CarouselView {
    private static final String PARCEL_CAROUSEL_ID = "parcel_carousel_id";
    private static final int PERMISSION_REQUEST_CODE = 12306;
    CarouselScreenPagerAdapter adapter;
    Provider<AppConfig> appConfigProvider;
    CarouselPresenter carouselPresenter;
    private View closeBackground;
    private ImageButton closeButton;
    private ConstraintLayout closeButtonContainer;
    MetricTracker metricTracker;
    LinearLayout navigationDotsLayout;
    PermissionManager permissionManager;
    PermissionRequest permissionRequest;
    private ConstraintLayout rootView;
    private FrameLayout stateContainer;
    ViewPager viewPager;
    private final Twig twig = LumberMill.getLogger();
    boolean isLastScreenViewed = false;
    int numberOfScreensSeen = 0;
    ScreenAction currentPermissionAction = ScreenAction.NULL;
    boolean sentToSettings = false;
    String currentScreenId = "";

    private FrameLayout.LayoutParams buildContentLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.intercom_carousel_padding);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        return layoutParams;
    }

    private View buildErrorMessage(int i10) {
        TextView textView = new TextView(this);
        textView.setLayoutParams(buildContentLayoutParams());
        BlockUtils.setMarginBottom(textView, 16);
        styleErrorMessage(textView);
        textView.setText(i10);
        return textView;
    }

    public static Intent buildIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) IntercomCarouselActivity.class);
        intent.putExtra(PARCEL_CAROUSEL_ID, str);
        intent.setFlags(268435456);
        return intent;
    }

    private d buildLoadingContainer() {
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(this);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    private View buildLoadingContent() {
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(buildContentLayoutParams());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(R.drawable.intercom_content_loading);
        return imageView;
    }

    private View buildLoadingState() {
        d dVarBuildLoadingContainer = buildLoadingContainer();
        dVarBuildLoadingContainer.addView(buildLoadingContent());
        return dVarBuildLoadingContainer;
    }

    private View buildRetryButton() {
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.intercom_carousel_action_button, (ViewGroup) this.stateContainer, false);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setText(R.string.intercom_retry);
        BackgroundUtils.setButtonColor(textView, this.appConfigProvider.get().getPrimaryColor());
        textView.setLayoutParams(buildRetryButtonLayoutParams());
        textView.setOnClickListener(new n(this, 1));
        return textView;
    }

    private FrameLayout.LayoutParams buildRetryButtonLayoutParams() {
        FrameLayout.LayoutParams layoutParamsBuildContentLayoutParams = buildContentLayoutParams();
        layoutParamsBuildContentLayoutParams.height = getResources().getDimensionPixelSize(R.dimen.intercom_office_hours_height);
        layoutParamsBuildContentLayoutParams.setMargins(layoutParamsBuildContentLayoutParams.leftMargin, layoutParamsBuildContentLayoutParams.topMargin, layoutParamsBuildContentLayoutParams.rightMargin, getResources().getDimensionPixelSize(R.dimen.intercom_carousel_action_button_bottom_padding));
        layoutParamsBuildContentLayoutParams.gravity = 80;
        return layoutParamsBuildContentLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildRetryButton$1(View view) {
        this.carouselPresenter.retryFetch(getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n0 lambda$setInsets$0(View view, n0 n0Var) {
        b bVarG = n0Var.f16948a.g(135);
        view.setPadding(bVarG.f46851a, bVarG.f46852b, bVarG.f46853c, bVarG.f46854d);
        return n0.f16947b;
    }

    private void setCloseButtonColor(int i10) {
        int iA = a.b.a(this, i10);
        this.closeBackground.getBackground().setTint(iA);
        this.closeButton.getDrawable().setTint(iA);
    }

    private void setInsets() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.intercom_carousel_root);
        this.rootView = constraintLayout;
        k kVar = new k(3);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(constraintLayout, kVar);
    }

    private void setupViewPagerWithScreens(List<CarouselScreen> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CarouselScreen> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CarouselScreenFragment.newInstance(it.next()));
        }
        CarouselScreenPagerAdapter carouselScreenPagerAdapter = new CarouselScreenPagerAdapter(getSupportFragmentManager(), arrayList);
        this.adapter = carouselScreenPagerAdapter;
        this.viewPager.setAdapter(carouselScreenPagerAdapter);
        ViewPager viewPager = this.viewPager;
        if (viewPager.f20236S == null) {
            viewPager.f20236S = new ArrayList();
        }
        viewPager.f20236S.add(this);
        onPageSelected(0);
    }

    private void showRationaleDialog(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        e eVarShow = new e.a(this).setTitle(i10).setMessage(i11).setPositiveButton(R.string.intercom_app_settings, onClickListener).setNegativeButton(R.string.intercom_not_now, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i12) {
                IntercomCarouselActivity.this.skipPermissionScreen();
            }
        }).setCancelable(false).show();
        int iPrimaryOrDarkColor = ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get());
        eVarShow.f(-2).setTextColor(iPrimaryOrDarkColor);
        eVarShow.f(-1).setTextColor(iPrimaryOrDarkColor);
    }

    private void showState(View view) {
        setCloseButtonColor(R.color.intercom_carousel_grey);
        this.stateContainer.removeAllViews();
        this.stateContainer.addView(view);
        this.stateContainer.setVisibility(0);
    }

    private void styleErrorMessage(TextView textView) {
        textView.setBreakStrategy(0);
        textView.setTextColor(a.b.a(this, R.color.intercom_black));
        textView.setTextSize(34.0f);
        textView.setTypeface(null, 1);
        textView.setLineSpacing(ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
        textView.setGravity(1);
    }

    private void updateCloseButtonColor(boolean z10) {
        setCloseButtonColor(z10 ? R.color.intercom_carousel_grey : R.color.intercom_white);
    }

    public void closeCarouselAndResetPersistedData() {
        this.carouselPresenter.resetPersistedCarousel();
        finish();
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void dismissCarousel(String str) {
        if (!Carousel.NULL.equals(this.carouselPresenter.getCarousel())) {
            this.carouselPresenter.recordDismissedOrCompletedStats(this.isLastScreenViewed);
            this.carouselPresenter.recordDismissedOrCompletedMetric(str, this.isLastScreenViewed, this.numberOfScreensSeen);
        }
        closeCarouselAndResetPersistedData();
    }

    public void goToSettings() {
        this.sentToSettings = true;
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getPackageName(), null)));
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void logEmptyCarouselError() {
        this.twig.e("Could not open carousel without id", new Object[0]);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void logUserNotRegisteredError() {
        this.twig.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayCarousel(carouselId).", new Object[0]);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.carouselPresenter.getCarousel().isDismissible()) {
            dismissCarousel(MetricTracker.Context.FROM_ANDROID_BACK_BUTTON);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismissCarousel(MetricTracker.Context.FROM_CLOSE_BUTTON);
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        r.b(this);
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_carousel);
        setInsets();
        this.viewPager = (ViewPager) findViewById(R.id.intercom_view_pager);
        this.closeBackground = findViewById(R.id.intercom_close_background);
        this.closeButton = (ImageButton) findViewById(R.id.intercom_close);
        this.closeButtonContainer = (ConstraintLayout) findViewById(R.id.intercom_carousel_close_container);
        this.navigationDotsLayout = (LinearLayout) findViewById(R.id.intercom_page_navigation_layout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.intercom_state_container);
        this.stateContainer = frameLayout;
        frameLayout.setVisibility(8);
        this.closeButton.setOnClickListener(this);
        this.closeButtonContainer.setOnClickListener(this);
        Injector injector = Injector.get();
        this.appConfigProvider = injector.getAppConfigProvider();
        PermissionManager permissionManager = new PermissionManager(this);
        this.permissionManager = permissionManager;
        PermissionRequest permissionRequestCreate = PermissionRequestFactory.create(permissionManager);
        this.permissionRequest = permissionRequestCreate;
        permissionRequestCreate.attach(this);
        this.metricTracker = injector.getMetricTracker();
        CarouselPresenter carouselPresenter = new CarouselPresenter(injector.getApi(), injector.getUserIdentity(), this.metricTracker, this.permissionManager, injector.getDataLayer());
        this.carouselPresenter = carouselPresenter;
        carouselPresenter.attachView(this);
        this.carouselPresenter.fetchCarousel(getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onDestroy() {
        this.permissionRequest.detach();
        super.onDestroy();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i10) {
        List<CarouselScreen> screens = this.carouselPresenter.getCarousel().getScreens();
        int size = screens.size();
        if (size > i10) {
            CarouselScreen carouselScreen = screens.get(i10);
            this.currentPermissionAction = carouselScreen.getPermissionAction();
            this.currentScreenId = carouselScreen.getId();
            boolean zIsColorLight = ColorUtils.isColorLight(carouselScreen.getBackgroundColor());
            renderNavigationDots(this.adapter.getCount(), zIsColorLight, i10);
            updateCloseButtonColor(zIsColorLight);
            if (i10 >= this.numberOfScreensSeen) {
                this.carouselPresenter.recordScreenSeenStats(carouselScreen.getId());
                this.numberOfScreensSeen = i10 + 1;
            }
            if (i10 + 1 == size) {
                this.isLastScreenViewed = true;
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == PERMISSION_REQUEST_CODE) {
            this.carouselPresenter.recordPermissionRequestedMetric(this.currentPermissionAction.getType(), iArr, this.currentScreenId);
            this.permissionRequest.handleResult(strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.sentToSettings) {
            this.sentToSettings = false;
            this.carouselPresenter.recordSentToPermissionSettingsMetric(this.currentPermissionAction, this.currentScreenId);
        }
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void openLink(String str) {
        dismissCarousel(MetricTracker.Context.FROM_CTA);
        LinkOpener.handleUrl(str, this, Injector.get().getApi());
    }

    public void renderNavigationDots(int i10, boolean z10, int i11) {
        this.navigationDotsLayout.removeAllViews();
        int i12 = z10 ? R.drawable.intercom_tab_dot_selector_dark : R.drawable.intercom_tab_dot_selector_light;
        for (int i13 = 0; i13 < i10; i13++) {
            View view = new View(this);
            int iDpToPx = ScreenUtils.dpToPx(16.0f, this);
            view.setLayoutParams(new ViewGroup.LayoutParams(iDpToPx, iDpToPx));
            view.setBackgroundResource(i12);
            this.navigationDotsLayout.addView(view);
            if (i13 == i11) {
                view.setSelected(true);
            }
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void requestBackgroundLocationPermission() {
        showRationaleDialog(R.string.intercom_access_background_location_title, R.string.intercom_access_background_location_message, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                IntercomCarouselActivity.this.permissionManager.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, IntercomCarouselActivity.PERMISSION_REQUEST_CODE);
            }
        });
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void requestPermissions(ScreenAction screenAction) {
        this.permissionRequest.request(screenAction, PERMISSION_REQUEST_CODE);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void selectNextScreen(String str) {
        int currentItem = this.viewPager.getCurrentItem() + 1;
        if (currentItem < this.adapter.getCount()) {
            this.viewPager.setCurrentItem(currentItem);
        } else {
            dismissCarousel(str);
        }
    }

    public void selectNextScreenWithDelay() {
        new Handler().postDelayed(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.4
            @Override // java.lang.Runnable
            public void run() {
                IntercomCarouselActivity.this.selectNextScreen(MetricTracker.Context.FROM_PERMISSION);
            }
        }, 1000L);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void showDeniedPermanently() {
        showGoToSettingsDialog();
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void showDeniedTemporarily() {
        selectNextScreen(MetricTracker.Context.FROM_PERMISSION);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showGenericError() {
        showState(buildErrorMessage(R.string.intercom_something_went_wrong_try_again));
        this.stateContainer.addView(buildRetryButton());
    }

    public void showGoToSettingsDialog() {
        showRationaleDialog(R.string.intercom_permission_denied, R.string.intercom_go_to_device_settings, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                IntercomCarouselActivity.this.goToSettings();
            }
        });
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void showGranted() {
        selectNextScreenWithDelay();
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showLoading() {
        showState(buildLoadingState());
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showNotFoundError() {
        showState(buildErrorMessage(R.string.intercom_page_not_found));
    }

    public void showOrHideNavigationDots(List<CarouselScreen> list) {
        this.navigationDotsLayout.setVisibility(list.size() > 1 ? 0 : 8);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showSuccess(Carousel carousel) {
        this.stateContainer.setVisibility(8);
        List<CarouselScreen> screens = carousel.getScreens();
        if (screens.isEmpty()) {
            closeCarouselAndResetPersistedData();
        } else {
            this.carouselPresenter.recordOpenMetric();
        }
        this.closeButtonContainer.setVisibility(carousel.isDismissible() ? 0 : 8);
        showOrHideNavigationDots(screens);
        setupViewPagerWithScreens(screens);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void skipPermissionScreen() {
        this.metricTracker.skippedPermission(this.currentPermissionAction.getType(), this.carouselPresenter.getCarousel().getInstanceId(), this.carouselPresenter.getCarouselSource());
        selectNextScreen(MetricTracker.Context.FROM_PERMISSION_SKIPPED);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void startChat() {
        dismissCarousel(MetricTracker.Context.FROM_CTA);
        if (this.appConfigProvider.get().isInboundMessages()) {
            startActivity(ConversationScreenOpenerKt.getComposerIntent(this, "", false, null, null, IntercomRootActivity.class));
        }
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void trackActionButtonTappedStats() {
        this.carouselPresenter.recordActionButtonTappedStats(this.currentScreenId);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i10, float f10, int i11) {
    }
}
