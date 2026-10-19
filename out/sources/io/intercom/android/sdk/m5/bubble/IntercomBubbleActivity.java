package io.intercom.android.sdk.m5.bubble;

import Ia.p;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.a;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: IntercomBubbleActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomBubbleActivity extends ComponentActivity {
    public static final int $stable = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.a(this, new ComposableLambdaImpl(true, 947575690, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                } else {
                    final IntercomBubbleActivity intercomBubbleActivity = IntercomBubbleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, a.b(-397450188, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.1.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                            if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Intent intent = intercomBubbleActivity.getIntent();
                            i.d(intent, "getIntent(...)");
                            IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomBubbleActivity, interfaceC1084f2, 8);
                        }
                    }, interfaceC1084f), interfaceC1084f, 3072, 7);
                }
            }
        }));
    }
}
