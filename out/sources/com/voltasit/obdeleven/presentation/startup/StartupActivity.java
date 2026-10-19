package com.voltasit.obdeleven.presentation.startup;

import Pb.a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.text.font.s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.NotificationType;
import com.voltasit.obdeleven.presentation.notification.NotificationActivity;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.activity.MainLandscapeActivity;
import com.voltasit.obdeleven.ui.dialogs.C2175v0;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p005a4.p;
import p100i.d;
import p279w9.b;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: StartupActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StartupActivity extends d implements C2175v0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33274e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33275b = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<StartupActivityViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.startup.StartupActivity$special$$inlined$viewModel$default$1
        final /* synthetic */ ComponentActivity $this_viewModel;
        final /* synthetic */ a $qualifier = null;
        final /* synthetic */ Ia.a $extrasProducer = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModel = this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel] */
        @Override // Ia.a
        public final StartupActivityViewModel invoke() {
            p014b1.a defaultViewModelCreationExtras;
            ComponentActivity componentActivity = this.$this_viewModel;
            a aVar = this.$qualifier;
            Ia.a aVar2 = this.$extrasProducer;
            Ia.a aVar3 = this.$parameters;
            b0 viewModelStore = componentActivity.getViewModelStore();
            if (aVar2 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar2.invoke()) == null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
            p014b1.a aVar4 = defaultViewModelCreationExtras;
            org.koin.core.scope.a aVarI = Cb.a.i(componentActivity);
            c cVarA = l.a(StartupActivityViewModel.class);
            i.b(viewModelStore);
            return Gb.a.a(cVarA, viewModelStore, null, aVar4, aVar, aVarI, aVar3);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p296y0.a f33276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f33277d;

    /* JADX INFO: compiled from: StartupActivity.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33278b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f33278b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33278b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33278b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33278b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33278b.hashCode();
        }
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.C2175v0.a
    public final void h(DialogInterfaceOnCancelListenerC1342g dialog) {
        i.e(dialog, "dialog");
        finishAndRemoveTask();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.dialogs.C2175v0.a
    public final void i(DialogInterfaceOnCancelListenerC1342g dialog) {
        i.e(dialog, "dialog");
        ((StartupActivityViewModel) this.f33275b.getValue()).c();
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        p296y0.a aVar = new p296y0.a(this);
        p296y0.a.C0553a c0553a = aVar.f48015a;
        c0553a.a();
        this.f33276c = aVar;
        c0553a.b(new s(4));
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        com.voltasit.obdeleven.notifications.a aVar2 = null;
        if (extras != null && (string = extras.getString("type")) != null) {
            NotificationType.f30491b.getClass();
            NotificationType notificationTypeA = NotificationType.a.a(string);
            String string2 = extras.getString("title");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = extras.getString("message");
            String str = string3 != null ? string3 : "";
            Bundle bundle2 = new Bundle();
            bundle2.putString("content_image_url", extras.getString("imageUrl"));
            bundle2.putString("content_destination_url", extras.getString("destinationUrl"));
            r rVar = r.f47939a;
            aVar2 = new com.voltasit.obdeleven.notifications.a(notificationTypeA, string2, str, bundle2);
        }
        if (aVar2 != null) {
            if (aVar2.f31202a == NotificationType.MEGA_OFFER) {
                Intent intent = new Intent(this, (Class<?>) NotificationActivity.class);
                intent.putExtras(aVar2.f31205d);
                startActivity(intent);
                finish();
                return;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        b bVar = Application.f29634b;
        P8.c.a(3, "StartupActivity", "onCreate() App version=0.107.1 (10800), Android SDK=" + i10 + ", Device=" + Build.MODEL, Arrays.copyOf(new Object[0], 0));
        setContentView(R.layout.startup_activity);
        this.f33277d = getIntent().getExtras();
        ?? r10 = this.f33275b;
        ((StartupActivityViewModel) r10.getValue()).f33288x.e(this, new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.startup.StartupActivity$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar2) {
                p296y0.a aVar3 = this.this$0.f33276c;
                if (aVar3 != null) {
                    aVar3.f48015a.b(new p(8));
                }
                new C2175v0().v(this.this$0.getSupportFragmentManager(), "PermissionTryAgainDialog");
                return r.f47939a;
            }
        }));
        ((StartupActivityViewModel) r10.getValue()).f33290z.e(this, new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.startup.StartupActivity$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar2) {
                StartupActivity startupActivity = this.this$0;
                int i11 = StartupActivity.f33274e;
                startupActivity.getClass();
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                Context applicationContext = startupActivity.getApplicationContext();
                i.d(applicationContext, "getApplicationContext(...)");
                Intent intent2 = new Intent(startupActivity, (Class<?>) (com.voltasit.obdeleven.a.C0320a.a(applicationContext).b("is_landscape", startupActivity.getResources().getBoolean(R.bool.is_tablet)) ? MainLandscapeActivity.class : MainActivity.class));
                intent2.putExtra("pushData", startupActivity.f33277d);
                intent2.putExtra("SignedOutSnackBar", false);
                startupActivity.startActivity(intent2);
                startupActivity.finish();
                return r.f47939a;
            }
        }));
    }
}
