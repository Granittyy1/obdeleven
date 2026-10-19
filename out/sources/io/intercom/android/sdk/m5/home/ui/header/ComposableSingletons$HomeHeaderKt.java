package io.intercom.android.sdk.m5.home.ui.header;

import Ia.p;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HomeHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderKt {
    public static final ComposableSingletons$HomeHeaderKt INSTANCE = new ComposableSingletons$HomeHeaderKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f209lambda1 = new ComposableLambdaImpl(false, 1111020598, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            Avatar avatarCreate = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "RS");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            String str = null;
            boolean z10 = true;
            String str2 = "";
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle = null;
            boolean z11 = true;
            HomeHeaderKt.HomeContentHeader(null, new HomeUiState.Content.ContentHeader(z10, str2, str, new HomeUiState.Content.ContentHeader.ColoredText("I am greeting.", 0.5f, str, null, "#FFFFFF", "#000000", 12, null), new HomeUiState.Content.ContentHeader.ColoredText("I am intro.", 1.0f, null, null, "#FFFFFF", "#000000", 12, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), false, null), headerBackdropStyle, z11, listS, new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 64, null), interfaceC1084f, 64, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f210lambda2 = new ComposableLambdaImpl(false, -2058941199, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                int i11 = H.f13505m;
                SurfaceKt.a(null, null, H.f13501h, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m319getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12583296, R.styleable.AppCompatTheme_windowFixedWidthMinor);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f211lambda3 = new ComposableLambdaImpl(false, 555108293, ComposableSingletons$HomeHeaderKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f212lambda4 = new ComposableLambdaImpl(false, 37843776, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-4$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m321getLambda3$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m319getLambda1$intercom_sdk_base_release() {
        return f209lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m320getLambda2$intercom_sdk_base_release() {
        return f210lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m321getLambda3$intercom_sdk_base_release() {
        return f211lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m322getLambda4$intercom_sdk_base_release() {
        return f212lambda4;
    }
}
