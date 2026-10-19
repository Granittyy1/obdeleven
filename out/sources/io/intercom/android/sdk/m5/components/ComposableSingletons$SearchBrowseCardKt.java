package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: SearchBrowseCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$SearchBrowseCardKt {
    public static final ComposableSingletons$SearchBrowseCardKt INSTANCE = new ComposableSingletons$SearchBrowseCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f57lambda1 = new ComposableLambdaImpl(false, 1563709076, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, kotlin.collections.l.s(new SuggestedArticle("", "How to restart recording", ""), new SuggestedArticle("", "How to track your recording time", ""), new SuggestedArticle("", "How to correct your transcript", "")));
            Avatar avatarCreate = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listS, true, metricTracker, interfaceC1084f, 36408);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f58lambda2 = new ComposableLambdaImpl(false, -1740562678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, EmptyList.f42983b);
            Avatar avatarCreate = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listS, true, metricTracker, interfaceC1084f, 36408);
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f59lambda3 = new ComposableLambdaImpl(false, 130670641, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-3$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, kotlin.collections.l.s(new SuggestedArticle("", "How to restart recording", ""), new SuggestedArticle("", "How to track your recording time", ""), new SuggestedArticle("", "How to correct your transcript", "")));
            Avatar avatarCreate = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listS, true, metricTracker, interfaceC1084f, 36408);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f60lambda4 = new ComposableLambdaImpl(false, 1883897723, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-4$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, EmptyList.f42983b);
            Avatar avatarCreate = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "PR");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listS, true, metricTracker, interfaceC1084f, 36408);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m110getLambda1$intercom_sdk_base_release() {
        return f57lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m111getLambda2$intercom_sdk_base_release() {
        return f58lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m112getLambda3$intercom_sdk_base_release() {
        return f59lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m113getLambda4$intercom_sdk_base_release() {
        return f60lambda4;
    }
}
