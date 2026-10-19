package io.intercom.android.sdk.m5;

import Ia.p;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.D;
import androidx.activity.compose.d;
import androidx.activity.r;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomRootActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootActivity extends IntercomBaseComponentActivity {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: IntercomRootActivity.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        D dA;
        super.onCreate(bundle);
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i10 == 1) {
            dA = D.a.a();
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((getResources().getConfiguration().uiMode & 48) == 32) {
                    dA = D.a.a();
                }
            }
            dA = D.a.b();
        }
        r.a(this, dA, dA);
        d.a(this, new ComposableLambdaImpl(true, 1535831366, new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i11) {
                if ((i11 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                i.d(appConfig, "get(...)");
                final IntercomRootActivity intercomRootActivity = IntercomRootActivity.this;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, androidx.compose.runtime.internal.a.b(-1535408283, new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.1.1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                        if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Intent intent = intercomRootActivity.getIntent();
                        i.d(intent, "getIntent(...)");
                        IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomRootActivity, interfaceC1084f2, 8);
                    }
                }, interfaceC1084f), interfaceC1084f, 56);
            }
        }));
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Injector.get().getDataLayer().clearOpenResponse();
    }
}
