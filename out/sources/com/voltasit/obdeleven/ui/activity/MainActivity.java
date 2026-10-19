package com.voltasit.obdeleven.ui.activity;

import B8.E0;
import I4.e;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.O;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.y;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import com.braze.Constants;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.obdeleven.service.exception.OBDelevenException;
import com.obdeleven.service.interfaces.IDevice;
import com.parse.ControlUnitDB;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import com.parse.ParseSession;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.core.app.M;
import com.voltasit.obdeleven.core.app.p0;
import com.voltasit.obdeleven.domain.exceptions.CancelException;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import com.voltasit.obdeleven.domain.models.NotificationType;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirect;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.MainActivityViewKt;
import com.voltasit.obdeleven.presentation.about.AboutFragment;
import com.voltasit.obdeleven.presentation.devices.DeviceFragment;
import com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.main.MainFragment;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2177w0;
import com.voltasit.obdeleven.ui.dialogs.C2183z0;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import com.voltasit.obdeleven.ui.dialogs.J;
import com.voltasit.obdeleven.ui.dialogs.d1;
import com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet;
import com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog;
import com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.CreditUtils;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import com.voltasit.parse.Parse;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.Intercom;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1512z;
import p097h9.x;
import p134k8.a2;
import p220r9.C;
import p220r9.G;
import p220r9.L;
import p220r9.P;
import p220r9.S;
import p255u9.E;
import p255u9.F;
import p255u9.z;
import p279w9.a;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public class MainActivity extends BaseActivity implements W7.d, NavigationView.b, CreditUtils.a, com.voltasit.obdeleven.presentation.a, DialogCallback {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static boolean f33531Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f33532A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public NavigationManager f33533B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f33534C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f33535D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f33536E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public BonusDialog f33537F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Dialog f33538G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TaskCompletionSource<Void> f33539H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f33540I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final p063f.c<String[]> f33541J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Ia.l<? super Boolean, p293xa.r> f33542K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p063f.c<Intent> f33543L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Ia.l<? super Boolean, p293xa.r> f33544M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ForceChangePasswordDialog f33545N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public d1 f33546O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public BoomboardingDialog f33547P;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33548c = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<MainActivityViewModel>(this) { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$special$$inlined$viewModel$default$1
        final /* synthetic */ ComponentActivity $this_viewModel;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $extrasProducer = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModel = this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.ui.activity.MainActivityViewModel] */
        @Override // Ia.a
        public final MainActivityViewModel invoke() {
            p014b1.a defaultViewModelCreationExtras;
            ComponentActivity componentActivity = this.$this_viewModel;
            Pb.a aVar = this.$qualifier;
            Ia.a aVar2 = this.$extrasProducer;
            Ia.a aVar3 = this.$parameters;
            b0 viewModelStore = componentActivity.getViewModelStore();
            if (aVar2 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar2.invoke()) == null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
            p014b1.a aVar4 = defaultViewModelCreationExtras;
            org.koin.core.scope.a aVarI = Cb.a.i(componentActivity);
            kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(MainActivityViewModel.class);
            kotlin.jvm.internal.i.b(viewModelStore);
            return Gb.a.a(cVarA, viewModelStore, null, aVar4, aVar, aVarI, aVar3);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f33550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f33551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f33552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f33553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2177w0 f33554i;
    public Toolbar j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DrawerLayout f33555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f33556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f33557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f33558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public NavigationView f33559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FrameLayout f33560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f33561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f33562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f33563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f33564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f33566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f33568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f33569y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f33570z;

    /* JADX INFO: compiled from: MainActivity.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource<E> f33571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MainActivity f33572b;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivity$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MainActivity.kt */
        public static final class C0346a<TTaskResult, TContinuationResult> implements Continuation {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f33573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaskCompletionSource<E> f33574b;

            public C0346a(TaskCompletionSource taskCompletionSource, MainActivity mainActivity) {
                this.f33573a = mainActivity;
                this.f33574b = taskCompletionSource;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) throws Throwable {
                kotlin.jvm.internal.i.e(task, "task");
                F f10 = (F) task.getResult();
                TaskCompletionSource<E> taskCompletionSource = this.f33574b;
                if (f10 != null) {
                    MainActivityViewModel mainActivityViewModelB = this.f33573a.B();
                    mainActivityViewModelB.getClass();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    C2680e.d(EmptyCoroutineContext.f43032b, new MainActivityViewModel$saveVehicle$1(ref$ObjectRef, mainActivityViewModelB, f10, null));
                    taskCompletionSource.setResult((E) ref$ObjectRef.element);
                } else {
                    taskCompletionSource.setResult(null);
                }
                return null;
            }
        }

        public a(TaskCompletionSource<E> taskCompletionSource, MainActivity mainActivity) {
            this.f33571a = taskCompletionSource;
            this.f33572b = mainActivity;
        }

        public final void a() {
            this.f33571a.setError(new CancelException());
        }

        public final void b(String str) {
            int i10 = 1;
            MainActivity mainActivity = this.f33572b;
            mainActivity.w().e("MainActivity", "onList(" + str + ")");
            int i11 = DialogC2146g0.f33952l;
            p279w9.b bVar = Application.f29634b;
            P8.c.a(3, "ModelDialog", "getByMake(%s)", Arrays.copyOf(new Object[]{str}, 1));
            Task taskA = p279w9.d.a(F.a(str), new p279w9.a("SUPPORTED_MODELS".concat(str), 0L), null);
            com.voltasit.obdeleven.presentation.controlUnit.basicsettings.b bVar2 = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.b(i10, mainActivity);
            Executor executor = Task.UI_THREAD_EXECUTOR;
            taskA.continueWith(bVar2, executor).continueWith(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.m(i10)).continueWithTask(new M(2), executor).continueWith(new C0346a(this.f33571a, mainActivity));
        }
    }

    /* JADX INFO: compiled from: MainActivity.kt */
    public static final class b implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33575b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ia.l lVar) {
            this.f33575b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f33575b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33575b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f33575b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f33575b.hashCode();
        }
    }

    public MainActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42971b;
        this.f33549d = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<J8.h>(this) { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$special$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.h, java.lang.Object] */
            @Override // Ia.a
            public final J8.h invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(J8.h.class));
            }
        });
        this.f33550e = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<com.voltasit.obdeleven.network.b>(this) { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$special$$inlined$inject$default$2
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.network.b, java.lang.Object] */
            @Override // Ia.a
            public final com.voltasit.obdeleven.network.b invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.b.class));
            }
        });
        this.f33551f = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<com.voltasit.obdeleven.data.providers.q>(this) { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$special$$inlined$inject$default$3
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.data.providers.q, java.lang.Object] */
            @Override // Ia.a
            public final com.voltasit.obdeleven.data.providers.q invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.data.providers.q.class));
            }
        });
        this.f33541J = registerForActivityResult(new p076g.b(), new p063f.b() { // from class: com.voltasit.obdeleven.ui.activity.j
            @Override // p063f.b
            public final void b(Object obj) {
                Object next;
                Map result = (Map) obj;
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$0 = this.f33678b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(result, "result");
                Ia.l<? super Boolean, p293xa.r> lVar = this$0.f33542K;
                if (lVar != null) {
                    Iterator it = result.values().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((Boolean) next).booleanValue());
                    ((MainActivity$requestPermissions$1) lVar).invoke(Boolean.valueOf(next == null));
                }
            }
        });
        this.f33543L = registerForActivityResult(new p076g.d(), new p063f.b() { // from class: com.voltasit.obdeleven.ui.activity.k
            @Override // p063f.b
            public final void b(Object obj) {
                p063f.a it = (p063f.a) obj;
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$0 = this.f33679b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(it, "it");
                Ia.l<? super Boolean, p293xa.r> lVar = this$0.f33544M;
                if (lVar != null) {
                    ((MainActivity$enableBluetooth$1) lVar).invoke(Boolean.valueOf(it.f34886b == -1));
                }
            }
        });
    }

    public static void N(MainActivity mainActivity, boolean z10, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        mainActivity.getClass();
        if (W7.c.d()) {
            W7.c.b();
        }
        Intent intent = new Intent(mainActivity, (Class<?>) (mainActivity.E() ? MainLandscapeActivity.class : MainActivity.class));
        intent.putExtra("EnableTwoFactor", z10);
        intent.putExtra("ShouldShowVagRedirectAfterLogin", z11);
        mainActivity.startActivity(intent);
        mainActivity.finish();
    }

    public final Task<E> A(boolean z10) {
        w().e("MainActivity", "garageList()");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        J j = new J(this, z10);
        j.f33810s = new a(taskCompletionSource, this);
        MainActivity mainActivity = j.f33812u;
        mainActivity.getClass();
        androidx.appcompat.app.e dialog = j.f33813v;
        kotlin.jvm.internal.i.e(dialog, "dialog");
        if (mainActivity.f33534C) {
            dialog.show();
        } else {
            mainActivity.f33538G = dialog;
        }
        dialog.show();
        Task<E> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.i.d(task, "getTask(...)");
        return task;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final MainActivityViewModel B() {
        return (MainActivityViewModel) this.f33548c.getValue();
    }

    public final void C() {
        C2177w0 c2177w0 = this.f33554i;
        if (c2177w0 != null) {
            c2177w0.y();
        }
        this.f33554i = null;
    }

    public final Task<E> D(final String vin, boolean z10) {
        G8.l lVarE;
        kotlin.jvm.internal.i.e(vin, "vin");
        w().e("MainActivity", "identifyVehicle()");
        IDevice iDeviceD = B().f33600M.d();
        String str = (iDeviceD == null || (lVarE = iDeviceD.e()) == null) ? null : lVarE.f3516a;
        if (str == null) {
            w().d(new Exception("Device not connected while identifying vehicle"), true);
            P.a(this, getString(R.string.common_device_not_connected));
            Task<E> taskForError = Task.forError(new Exception(new DeviceNotConnectedException().getMessage()));
            kotlin.jvm.internal.i.b(taskForError);
            return taskForError;
        }
        HashMap map = new HashMap();
        map.put("vin", vin);
        map.put("auto", Boolean.valueOf(z10));
        map.put("deviceId", str);
        Task<E> taskContinueWithTask = ParseCloud.callFunctionInBackground("identifyVehicleV2", map).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.ui.activity.p
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                boolean z11 = MainActivity.f33531Q;
                MainActivity this$0 = this.f33686a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String vin2 = vin;
                kotlin.jvm.internal.i.e(vin2, "$vin");
                Object result = task.getResult();
                if (task.isFaulted()) {
                    P.a(this$0, this$0.getString(R.string.common_check_network));
                    return Task.forError(task.getError());
                }
                if (!(result instanceof ArrayList)) {
                    return result instanceof E ? Task.forResult(result) : Task.forResult(null);
                }
                int i10 = F.f47460b;
                ParseQuery query = ParseQuery.getQuery(F.class);
                query.whereContainedIn("vehicleBase", (List) result);
                query.include("vehicleBase");
                query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
                Task taskOnSuccessTask = query.findInBackground().onSuccessTask(new p0(this$0, 2, vin2), Task.UI_THREAD_EXECUTOR);
                kotlin.jvm.internal.i.d(taskOnSuccessTask, "onSuccessTask(...)");
                return taskOnSuccessTask;
            }
        }, Task.UI_THREAD_EXECUTOR);
        kotlin.jvm.internal.i.b(taskContinueWithTask);
        return taskContinueWithTask;
    }

    public final boolean E() {
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        return com.voltasit.obdeleven.a.C0320a.a(this).b("is_landscape", getResources().getBoolean(R.bool.is_tablet));
    }

    public final void F() {
        File file = new File(getExternalFilesDir(null), "background.jpg");
        Bitmap bitmapDecodeFile = file.exists() ? BitmapFactory.decodeFile(file.getAbsolutePath()) : null;
        if (bitmapDecodeFile == null) {
            ImageView imageView = this.f33556l;
            kotlin.jvm.internal.i.b(imageView);
            imageView.setImageDrawable(null);
        } else {
            new View(this).setTag("e");
            p280wa.b bVar = new p280wa.b();
            bVar.f47834c = 25;
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            bVar.f47834c = com.voltasit.obdeleven.a.C0320a.a(this).d("backgroundBlurRadius", 0);
            ImageView imageView2 = this.f33556l;
            bVar.f47832a = bitmapDecodeFile.getWidth();
            bVar.f47833b = bitmapDecodeFile.getHeight();
            imageView2.setImageDrawable(new BitmapDrawable(getResources(), p280wa.a.a(imageView2.getContext(), bitmapDecodeFile, bVar)));
        }
        File file2 = new File(getExternalFilesDir(null), "menu_background.jpg");
        Bitmap bitmapDecodeFile2 = file2.exists() ? BitmapFactory.decodeFile(file2.getAbsolutePath()) : null;
        if (bitmapDecodeFile2 == null) {
            ImageView imageView3 = this.f33561q;
            kotlin.jvm.internal.i.b(imageView3);
            imageView3.setImageDrawable(null);
            return;
        }
        new View(this).setTag("e");
        p280wa.b bVar2 = new p280wa.b();
        bVar2.f47834c = 25;
        List<String> list2 = com.voltasit.obdeleven.a.f29638c;
        bVar2.f47834c = com.voltasit.obdeleven.a.C0320a.a(this).d("menuBackgroundBlurRadius", 0);
        ImageView imageView4 = this.f33561q;
        bVar2.f47832a = bitmapDecodeFile2.getWidth();
        bVar2.f47833b = bitmapDecodeFile2.getHeight();
        imageView4.setImageDrawable(new BitmapDrawable(getResources(), p280wa.a.a(imageView4.getContext(), bitmapDecodeFile2, bVar2)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    public final void G(o oVar) {
        Parse.f34394a.f34437a = null;
        ((com.voltasit.obdeleven.network.b) this.f33550e.getValue()).a("");
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        P("");
        if (zVar == null) {
            H(oVar);
        } else {
            zVar.saveInBackground(new D7.d(this, oVar));
        }
    }

    public final void H(o oVar) {
        e eVar = new e(this, oVar);
        if (com.voltasit.obdeleven.domain.usecases.device.u.k(this)) {
            ParseUser.logOutInBackground(new C1512z(this, eVar));
        } else {
            P.a(this, getString(R.string.common_unable_to_logout));
            C.b(this, eVar);
        }
    }

    public final Task<Void> I(IDevice device) {
        String str;
        kotlin.jvm.internal.i.e(device, "device");
        this.f33539H = new TaskCompletionSource<>();
        if (device instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
            str = ((com.voltasit.obdeleven.utils.bluetooth.o) device).f34376l;
            kotlin.jvm.internal.i.d(str, "getCpuId(...)");
        } else {
            str = "";
        }
        String str2 = str;
        String strF = device.f();
        String strB = device.b();
        MainActivityViewModel mainActivityViewModelB = B();
        kotlin.jvm.internal.i.b(strF);
        kotlin.jvm.internal.i.b(strB);
        int i10 = device.e().f3518c;
        SubscriptionType subscriptionType = device.e().f3517b;
        mainActivityViewModelB.getClass();
        C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$getUserDetailsBonusDialog$1(i10, subscriptionType, mainActivityViewModelB, str2, strF, strB, null), 2);
        TaskCompletionSource<Void> taskCompletionSource = this.f33539H;
        kotlin.jvm.internal.i.b(taskCompletionSource);
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.i.d(task, "getTask(...)");
        return task;
    }

    @p293xa.d
    public final void J() {
        NavigationManager navigationManager = this.f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        navigationManager.o(false);
    }

    @p293xa.d
    public final void K() {
        NavigationManager navigationManager = this.f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        navigationManager.h();
    }

    @p293xa.d
    public final void L() {
        NavigationManager navigationManager = this.f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        NavigationManager.i(navigationManager, x.class, true);
    }

    public final void M(String[] strArr, Ia.l<? super Boolean, p293xa.r> lVar) {
        this.f33542K = new MainActivity$requestPermissions$1(lVar);
        this.f33541J.a(strArr);
    }

    public final void O(boolean z10) {
        if (this.f33536E) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_finish", z10);
        com.voltasit.obdeleven.ui.dialogs.C c10 = new com.voltasit.obdeleven.ui.dialogs.C();
        c10.setArguments(bundle);
        c10.f32261r = getSupportFragmentManager();
        c10.A();
    }

    public final void P(String str) {
        if (str.length() == 0) {
            str = getString(R.string.common_loading);
            kotlin.jvm.internal.i.d(str, "getString(...)");
        }
        y supportFragmentManager = getSupportFragmentManager();
        Bundle bundleD = C4.v.d("key_message", str);
        C2177w0 c2177w0 = new C2177w0();
        c2177w0.setArguments(bundleD);
        c2177w0.f32261r = supportFragmentManager;
        this.f33554i = c2177w0;
        c2177w0.A();
    }

    public final void R() {
        String url;
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (zVar == null || ParseAnonymousUtils.isLinked(zVar)) {
            ImageView imageView = this.f33562r;
            kotlin.jvm.internal.i.b(imageView);
            imageView.setImageDrawable(getResources().getDrawable(2131230858));
            return;
        }
        ParseFile parseFile = zVar.getParseFile("picture");
        if (parseFile != null) {
            url = parseFile.getUrl();
            kotlin.jvm.internal.i.d(url, "getUrl(...)");
        } else {
            url = "drawable://2131230859";
        }
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(this).g(this).m(url);
        T3.d dVarJ = ((T3.d) E0.a(2131230859)).f(2131230859).j(2131230859);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        com.bumptech.glide.d<Drawable> dVarU = dVarM.a(dVarJ);
        ImageView imageView2 = this.f33562r;
        kotlin.jvm.internal.i.b(imageView2);
        dVarU.x(imageView2);
    }

    public final void S() {
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        R();
        if (zVar == null || ParseAnonymousUtils.isLinked(zVar)) {
            TextView textView = this.f33563s;
            kotlin.jvm.internal.i.b(textView);
            textView.setText(R.string.common_sign_in);
            TextView textView2 = this.f33564t;
            kotlin.jvm.internal.i.b(textView2);
            textView2.setVisibility(8);
            NavigationView navigationView = this.f33559o;
            kotlin.jvm.internal.i.b(navigationView);
            navigationView.getMenu().setGroupVisible(R.id.nav_user_group, false);
            return;
        }
        TextView textView3 = this.f33563s;
        kotlin.jvm.internal.i.b(textView3);
        textView3.setText(zVar.getString("name"));
        NavigationView navigationView2 = this.f33559o;
        kotlin.jvm.internal.i.b(navigationView2);
        navigationView2.getMenu().setGroupVisible(R.id.nav_user_group, true);
        if (UserTrackingUtils.f34238a.b("update_statistics", false)) {
            Task.callInBackground(new S(zVar));
        }
    }

    @p293xa.d
    public final void T() {
        B().f33642o.b();
    }

    @p293xa.d
    public final void U() {
        B().f33642o.a();
    }

    @Override // W7.d
    public final String a() {
        return "MainActivity";
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    @Override // com.google.android.material.navigation.NavigationView.b
    public final boolean b(MenuItem item) {
        E e10;
        kotlin.jvm.internal.i.e(item, "item");
        switch (item.getItemId()) {
            case R.id.nav_about /* 2131362961 */:
                NavigationManager navigationManager = this.f33533B;
                kotlin.jvm.internal.i.b(navigationManager);
                navigationManager.n(new AboutFragment(), null);
                break;
            case R.id.nav_controller_view_tag /* 2131362962 */:
            case R.id.nav_user_group /* 2131362971 */:
            default:
                return false;
            case R.id.nav_device /* 2131362963 */:
                MainActivityViewModel mainActivityViewModelB = B();
                mainActivityViewModelB.f33653t0.j(Boolean.valueOf(mainActivityViewModelB.f33648r.z()));
                break;
            case R.id.nav_garage /* 2131362964 */:
                a2 a2Var = W7.c.f7067e;
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) == null) {
                    NavigationManager navigationManager2 = this.f33533B;
                    if (navigationManager2 != null) {
                        navigationManager2.m(E());
                    }
                } else if (W7.c.f7067e != null && a2Var != null && (e10 = a2Var.f42726c) != null) {
                    p195p9.b bVar = new p195p9.b();
                    bVar.R(e10, false, false);
                    NavigationManager navigationManager3 = this.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager3);
                    navigationManager3.n(bVar, null);
                } else if (!E()) {
                    NavigationManager navigationManager4 = this.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager4);
                    navigationManager4.n(new GarageFragment(), null);
                } else {
                    NavigationManager navigationManager5 = this.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager5);
                    if (navigationManager5.f34234e == null) {
                        NavigationManager navigationManager6 = this.f33533B;
                        kotlin.jvm.internal.i.b(navigationManager6);
                        navigationManager6.n(new GarageFragment(), null);
                    } else {
                        NavigationManager navigationManager7 = this.f33533B;
                        kotlin.jvm.internal.i.b(navigationManager7);
                        BaseFragment<?> baseFragment = navigationManager7.f34234e;
                        kotlin.jvm.internal.i.b(baseFragment);
                        if (baseFragment.t() != Positionable$Position.f31108d) {
                            NavigationManager navigationManager8 = this.f33533B;
                            kotlin.jvm.internal.i.b(navigationManager8);
                            navigationManager8.n(new GarageFragment(), null);
                        } else {
                            NavigationManager navigationManager9 = this.f33533B;
                            kotlin.jvm.internal.i.b(navigationManager9);
                            NavigationManager.i(navigationManager9, MainFragment.class, false);
                            NavigationManager navigationManager10 = this.f33533B;
                            kotlin.jvm.internal.i.b(navigationManager10);
                            navigationManager10.n(new GarageFragment(), null);
                        }
                    }
                }
                break;
            case R.id.nav_help /* 2131362965 */:
                Intercom.Companion.client().displayMessenger();
                break;
            case R.id.nav_home /* 2131362966 */:
                NavigationManager navigationManager11 = this.f33533B;
                kotlin.jvm.internal.i.b(navigationManager11);
                navigationManager11.o(false);
                break;
            case R.id.nav_logout /* 2131362967 */:
                G(null);
                DrawerLayout drawerLayout = this.f33555k;
                kotlin.jvm.internal.i.b(drawerLayout);
                drawerLayout.d();
                break;
            case R.id.nav_lookup /* 2131362968 */:
                NavigationManager navigationManager12 = this.f33533B;
                kotlin.jvm.internal.i.b(navigationManager12);
                navigationManager12.n(new com.voltasit.obdeleven.ui.module.g(), null);
                break;
            case R.id.nav_profile /* 2131362969 */:
                B().g(E());
                break;
            case R.id.nav_settings /* 2131362970 */:
                NavigationManager navigationManager13 = this.f33533B;
                kotlin.jvm.internal.i.b(navigationManager13);
                navigationManager13.n(new SettingsFragment(), null);
                break;
            case R.id.nav_vehicle_lookup /* 2131362972 */:
                int i11 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null) {
                    NavigationManager navigationManager14 = this.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager14);
                    navigationManager14.n(new com.voltasit.obdeleven.ui.module.l(), null);
                } else if (!E()) {
                    NavigationManager navigationManager15 = this.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager15);
                    navigationManager15.n(new com.voltasit.obdeleven.ui.module.c(), null);
                } else {
                    NavigationManager navigationManager16 = this.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager16);
                    navigationManager16.o(false);
                }
                break;
        }
        DrawerLayout drawerLayout2 = this.f33555k;
        kotlin.jvm.internal.i.b(drawerLayout2);
        drawerLayout2.d();
        return true;
    }

    @Override // W7.d
    public final void e(int i10) {
        String string;
        if (i10 == 0) {
            NavigationView navigationView = this.f33559o;
            kotlin.jvm.internal.i.b(navigationView);
            navigationView.getMenu().findItem(R.id.nav_garage).setTitle(R.string.common_garage);
            string = getString(R.string.common_status_not_connected);
        } else if (i10 == 1) {
            string = getString(R.string.view_main_status_connecting);
        } else {
            if (i10 != 2) {
                return;
            }
            NavigationView navigationView2 = this.f33559o;
            kotlin.jvm.internal.i.b(navigationView2);
            navigationView2.getMenu().findItem(R.id.nav_garage).setTitle(R.string.common_car);
            string = getString(R.string.view_main_status_connected);
        }
        String strC = B7.b.c("", string);
        TextView textView = this.f33557m;
        kotlin.jvm.internal.i.b(textView);
        textView.setText(strC);
    }

    @Override // com.voltasit.obdeleven.presentation.a
    public final void f() {
        MainActivityViewModel mainActivityViewModelB = B();
        mainActivityViewModelB.getClass();
        C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$updateApp$1(mainActivityViewModelB, null), 2);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        if (dialogId.equals("VagRedirectDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                d1 d1Var = this.f33546O;
                if (d1Var != null) {
                    d1Var.y();
                }
                this.f33546O = null;
                MainActivityViewModel mainActivityViewModelB = B();
                mainActivityViewModelB.f33657w.X(AnalyticsProvider$EventParamValue$VagRedirect.RedirectToMain);
                B().e();
                com.voltasit.obdeleven.ui.activity.a.a(this);
                return;
            }
            if (callbackType == DialogCallback.CallbackType.f31103d) {
                NavigationManager navigationManager = B().f33629b0;
                if (navigationManager != null) {
                    navigationManager.g("https://support.obdeleven.com/en/articles/10053429-volkswagen-group-features-in-the-obdeleven-app");
                    return;
                } else {
                    kotlin.jvm.internal.i.m("navigationManager");
                    throw null;
                }
            }
            d1 d1Var2 = this.f33546O;
            if (d1Var2 != null) {
                d1Var2.y();
            }
            this.f33546O = null;
            MainActivityViewModel mainActivityViewModelB2 = B();
            mainActivityViewModelB2.f33657w.X(AnalyticsProvider$EventParamValue$VagRedirect.Cancel);
            MainActivityViewModel mainActivityViewModelB3 = B();
            mainActivityViewModelB3.getClass();
            C2680e.c(Z.a(mainActivityViewModelB3), null, null, new MainActivityViewModel$onVagRedirectCancel$1(mainActivityViewModelB3, null), 3);
        }
    }

    @Override // com.voltasit.obdeleven.utils.CreditUtils.a
    public final void m(int i10) {
        w().e("MainActivity", "onCreditsChanged(" + i10 + ")");
        if (this.f33534C) {
            TextView textView = this.f33558n;
            kotlin.jvm.internal.i.b(textView);
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        MainActivityViewModel mainActivityViewModelB = B();
        mainActivityViewModelB.getClass();
        C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$onActivityResult$1(mainActivityViewModelB, this, i10, i11, intent, null), 2);
        if (i10 != 123) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 == -1) {
            this.f33540I = false;
            N(this, false, true, 1);
        } else {
            if (i11 != 101) {
                return;
            }
            this.f33540I = false;
            N(this, true, false, 2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w().e("MainActivity", "Called onBackPressed()");
        DrawerLayout drawerLayout = this.f33555k;
        kotlin.jvm.internal.i.b(drawerLayout);
        View viewF = drawerLayout.f(8388611);
        if (viewF != null ? DrawerLayout.o(viewF) : false) {
            DrawerLayout drawerLayout2 = this.f33555k;
            kotlin.jvm.internal.i.b(drawerLayout2);
            drawerLayout2.d();
            return;
        }
        NavigationManager navigationManager = this.f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        BaseFragment<?> baseFragmentD = navigationManager.d();
        if (baseFragmentD == null || !baseFragmentD.A()) {
            if (getSupportFragmentManager().H() > (E() ? 2 : 1)) {
                super.onBackPressed();
                NavigationManager navigationManager2 = this.f33533B;
                kotlin.jvm.internal.i.b(navigationManager2);
                navigationManager2.l(null);
                return;
            }
            if (this.f33566v + ((long) 2000) <= System.currentTimeMillis()) {
                P.e(this, getString(R.string.view_main_press_again_to_exit));
                this.f33566v = System.currentTimeMillis();
                return;
            }
            if (W7.c.d()) {
                if (W7.c.d()) {
                    W7.c.b();
                }
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                if (com.voltasit.obdeleven.a.C0320a.a(this).b("showDeviceAlert", true)) {
                    O(true);
                    G.a(this, false);
                    return;
                }
                return;
            }
            if (W7.c.c() == 1) {
                MainActivityViewModel mainActivityViewModelB = B();
                mainActivityViewModelB.f33652t.e("MainActivityViewModel", "cancelBluetooth()");
                mainActivityViewModelB.f33663z.i();
                W7.c.g(0);
                W7.c.b();
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        JSONObject jSONObject;
        int i10 = 2;
        int i11 = 0;
        w().f("MainActivity", "MainActivity onCreate()");
        f33531Q = true;
        B().f33636i0.e(this, new b(new Ia.l<G8.D, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(G8.D d10) {
                G8.D d11 = d10;
                TextView textView = this.this$0.f33564t;
                if (textView != null) {
                    textView.setText(d11.f3410a.a());
                }
                TextView textView2 = this.this$0.f33564t;
                if (textView2 != null) {
                    W8.d.a(textView2, d11.f3410a);
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f32114c.e(this, new b(new Ia.l<PreloaderState, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(PreloaderState preloaderState) {
                PreloaderState preloaderState2 = preloaderState;
                if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.c.f32642a)) {
                    this.this$0.P("");
                } else if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.d.f32643a)) {
                    MainActivity mainActivity = this.this$0;
                    boolean z10 = MainActivity.f33531Q;
                    mainActivity.C();
                } else {
                    if (!(preloaderState2 instanceof PreloaderState.a)) {
                        if (!(preloaderState2 instanceof PreloaderState.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MainActivity mainActivity2 = this.this$0;
                        ((PreloaderState.b) preloaderState2).getClass();
                        boolean z11 = MainActivity.f33531Q;
                        mainActivity2.P(null);
                        throw null;
                    }
                    MainActivity mainActivity3 = this.this$0;
                    String string = mainActivity3.getString(((PreloaderState.a) preloaderState2).f32641a);
                    kotlin.jvm.internal.i.d(string, "getString(...)");
                    boolean z12 = MainActivity.f33531Q;
                    mainActivity3.P(string);
                }
                p293xa.r rVar = p293xa.r.f47939a;
                Na.i iVar = E8.a.f3126a;
                return p293xa.r.f47939a;
            }
        }));
        B().f33638k0.e(this, new b(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Boolean bool) {
                b bVar = new b(0);
                y supportFragmentManager = this.this$0.getSupportFragmentManager();
                kotlin.jvm.internal.i.d(supportFragmentManager, "getSupportFragmentManager(...)");
                bVar.f32261r = supportFragmentManager;
                bVar.v(supportFragmentManager, bVar.f33669s);
                return p293xa.r.f47939a;
            }
        }));
        B().f33640m0.e(this, new b(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Boolean bool) {
                MainActivity mainActivity = this.this$0;
                mainActivity.getClass();
                P.d(mainActivity, R.string.common_update_available, R.string.common_update, new com.voltasit.obdeleven.presentation.vagpromo.b(1, mainActivity));
                return p293xa.r.f47939a;
            }
        }));
        B().f33643o0.e(this, new b(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Boolean bool) {
                this.this$0.invalidateOptionsMenu();
                return p293xa.r.f47939a;
            }
        }));
        B().f32121k.e(this, new b(new Ia.l<String, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(String str) {
                P.a(this.this$0, str);
                return p293xa.r.f47939a;
            }
        }));
        B().f33647q0.e(this, new b(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Boolean bool) {
                Boolean bool2 = bool;
                PersonalInformationUpdateDialog personalInformationUpdateDialog = new PersonalInformationUpdateDialog();
                kotlin.jvm.internal.i.b(bool2);
                boolean zBooleanValue = bool2.booleanValue();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("should_logout_user", zBooleanValue);
                personalInformationUpdateDialog.setArguments(bundle2);
                personalInformationUpdateDialog.v(this.this$0.getSupportFragmentManager(), "PersonalInformationUpdateDialog");
                return p293xa.r.f47939a;
            }
        }));
        B().f33651s0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$8
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                P.b(this.this$0, R.string.common_check_network);
                return p293xa.r.f47939a;
            }
        }));
        B().f33655u0.e(this, new b(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Boolean bool) {
                Boolean bool2 = bool;
                kotlin.jvm.internal.i.b(bool2);
                if (bool2.booleanValue()) {
                    NavigationManager navigationManager = this.this$0.f33533B;
                    if (navigationManager != null) {
                        navigationManager.n(new DeviceFragment(), null);
                    }
                } else {
                    MainActivity mainActivity = this.this$0;
                    NavigationManager navigationManager2 = mainActivity.f33533B;
                    if (navigationManager2 != null) {
                        navigationManager2.m(mainActivity.E());
                    }
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f33633f0.e(this, new b(new Ia.l<com.voltasit.obdeleven.presentation.dialogs.bonus.c, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$10

            /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$10$1, reason: invalid class name */
            /* JADX INFO: compiled from: MainActivity.kt */
            final class AnonymousClass1 extends Lambda implements Ia.l<DialogInterface, p293xa.r> {
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MainActivity mainActivity) {
                    super(1);
                    this.this$0 = mainActivity;
                }

                @Override // Ia.l
                public final p293xa.r invoke(DialogInterface dialogInterface) {
                    DialogInterface it = dialogInterface;
                    kotlin.jvm.internal.i.e(it, "it");
                    it.dismiss();
                    TaskCompletionSource<Void> taskCompletionSource = this.this$0.f33539H;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    return p293xa.r.f47939a;
                }
            }

            /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$10$2, reason: invalid class name */
            /* JADX INFO: compiled from: MainActivity.kt */
            final class AnonymousClass2 extends Lambda implements Ia.l<DialogInterface, p293xa.r> {
                final /* synthetic */ com.voltasit.obdeleven.presentation.dialogs.bonus.c $navigationParams;
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MainActivity mainActivity, com.voltasit.obdeleven.presentation.dialogs.bonus.c cVar) {
                    super(1);
                    this.this$0 = mainActivity;
                    this.$navigationParams = cVar;
                }

                @Override // Ia.l
                public final p293xa.r invoke(DialogInterface dialogInterface) {
                    DialogInterface it = dialogInterface;
                    kotlin.jvm.internal.i.e(it, "it");
                    it.dismiss();
                    MainActivityViewModel mainActivityViewModelB = this.this$0.B();
                    com.voltasit.obdeleven.presentation.dialogs.bonus.c cVar = this.$navigationParams;
                    mainActivityViewModelB.f(cVar.f32218a, cVar.f32219b, cVar.f32220c, cVar.f32221d, cVar.f32223f);
                    return p293xa.r.f47939a;
                }
            }

            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(com.voltasit.obdeleven.presentation.dialogs.bonus.c cVar) {
                MainActivity mainActivity = this.this$0;
                final AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainActivity);
                final AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                mainActivity.getClass();
                new F5.b(mainActivity, 0).l(mainActivity.getResources().getString(R.string.common_error)).c(mainActivity.getResources().getString(R.string.common_check_network_connection)).g(mainActivity.getResources().getString(R.string.common_cancel), new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.activity.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        boolean z10 = MainActivity.f33531Q;
                        Ia.l lVar = anonymousClass1;
                        kotlin.jvm.internal.i.b(dialogInterface);
                        ((MainActivity$setupObservers$10.AnonymousClass1) lVar).invoke(dialogInterface);
                    }
                }).j(mainActivity.getResources().getString(R.string.common_try_again), new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.activity.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        boolean z10 = MainActivity.f33531Q;
                        Ia.l lVar = anonymousClass2;
                        kotlin.jvm.internal.i.b(dialogInterface);
                        ((MainActivity$setupObservers$10.AnonymousClass2) lVar).invoke(dialogInterface);
                    }
                }).a().show().setCanceledOnTouchOutside(false);
                return p293xa.r.f47939a;
            }
        }));
        B().f33631d0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                TaskCompletionSource<Void> taskCompletionSource = this.this$0.f33539H;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f33635h0.e(this, new b(new Ia.l<com.voltasit.obdeleven.presentation.dialogs.bonus.c, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$12
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(com.voltasit.obdeleven.presentation.dialogs.bonus.c cVar) {
                com.voltasit.obdeleven.presentation.dialogs.bonus.c cVar2 = cVar;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_credits_from_device", cVar2.f32221d);
                bundle2.putString("key_cpuid", cVar2.f32218a);
                bundle2.putString("key_mac", cVar2.f32219b);
                bundle2.putString("key_serial", cVar2.f32220c);
                bundle2.putBoolean("key_user_can_consume_pro", cVar2.f32222e);
                bundle2.putString("key_subscription_type", cVar2.f32223f.b());
                MainActivity activity = this.this$0;
                kotlin.jvm.internal.i.e(activity, "activity");
                new Bundle();
                final MainActivity mainActivity = this.this$0;
                Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$12.1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        TaskCompletionSource<Void> taskCompletionSource = mainActivity.f33539H;
                        if (taskCompletionSource != null) {
                            taskCompletionSource.setResult(null);
                        }
                        return p293xa.r.f47939a;
                    }
                };
                BonusDialog bonusDialog = new BonusDialog();
                bonusDialog.setArguments(bundle2);
                bonusDialog.f32261r = activity.getSupportFragmentManager();
                bonusDialog.f32196t = aVar;
                if (activity.f33534C) {
                    bonusDialog.A();
                } else {
                    activity.f33537F = bonusDialog;
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f32123m.e(this, new b(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$13
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                MainActivity mainActivity = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                P.f(mainActivity, num2.intValue());
                return p293xa.r.f47939a;
            }
        }));
        B().f32120i.e(this, new b(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$14
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                MainActivity mainActivity = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                P.b(mainActivity, num2.intValue());
                return p293xa.r.f47939a;
            }
        }));
        B().f33577A0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$15
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                Task<E> taskA = this.this$0.A(true);
                MainActivityViewModel mainActivityViewModelB = this.this$0.B();
                MainActivity mainActivity = this.this$0;
                mainActivityViewModelB.getClass();
                kotlin.jvm.internal.i.e(mainActivity, "mainActivity");
                C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$handleVehicleIdentification$1(mainActivityViewModelB, taskA, mainActivity, null), 2);
                return p293xa.r.f47939a;
            }
        }));
        B().f33581C0.e(this, new b(new Ia.l<String, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$16
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(String str) {
                String str2 = str;
                MainActivity mainActivity = this.this$0;
                kotlin.jvm.internal.i.b(str2);
                Task<E> taskD = mainActivity.D(str2, true);
                MainActivityViewModel mainActivityViewModelB = this.this$0.B();
                MainActivity mainActivity2 = this.this$0;
                mainActivityViewModelB.getClass();
                kotlin.jvm.internal.i.e(mainActivity2, "mainActivity");
                C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$handleVehicleIdentification$1(mainActivityViewModelB, taskD, mainActivity2, null), 2);
                return p293xa.r.f47939a;
            }
        }));
        B().f33589G0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$17
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                MainActivity mainActivity = this.this$0;
                if (mainActivity.f33534C) {
                    NavigationManager navigationManager = mainActivity.f33533B;
                    kotlin.jvm.internal.i.b(navigationManager);
                    navigationManager.o(false);
                } else {
                    mainActivity.f33567w = true;
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f33605O0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$18

            /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$18$1, reason: invalid class name */
            /* JADX INFO: compiled from: MainActivity.kt */
            final class AnonymousClass1 extends Lambda implements Ia.a<p293xa.r> {
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MainActivity mainActivity) {
                    super(0);
                    this.this$0 = mainActivity;
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    this.this$0.B().e();
                    a.a(this.this$0);
                    return p293xa.r.f47939a;
                }
            }

            /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$18$2, reason: invalid class name */
            /* JADX INFO: compiled from: MainActivity.kt */
            final class AnonymousClass2 extends Lambda implements Ia.l<DialogInterface, p293xa.r> {
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MainActivity mainActivity) {
                    super(1);
                    this.this$0 = mainActivity;
                }

                @Override // Ia.l
                public final p293xa.r invoke(DialogInterface dialogInterface) {
                    DialogInterface it = dialogInterface;
                    kotlin.jvm.internal.i.e(it, "it");
                    MainActivityViewModel mainActivityViewModelB = this.this$0.B();
                    mainActivityViewModelB.getClass();
                    C2680e.c(Z.a(mainActivityViewModelB), null, null, new MainActivityViewModel$onNonVagRedirectCancel$1(mainActivityViewModelB, null), 3);
                    return p293xa.r.f47939a;
                }
            }

            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.ui.activity.i] */
            /* JADX WARN: Type inference failed for: r4v3, types: [com.voltasit.obdeleven.ui.activity.g] */
            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                this.this$0.w().f("MainActivity", "showBasicDialog");
                MainActivity mainActivity = this.this$0;
                final AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainActivity);
                final AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                mainActivity.getClass();
                new F5.b(mainActivity, 0).l(mainActivity.getResources().getString(R.string.dialog_open_non_vag_title)).c(mainActivity.getResources().getString(R.string.dialog_open_bmw_message)).e(mainActivity.getResources().getString(R.string.common_cancel), new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.activity.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        boolean z10 = MainActivity.f33531Q;
                        Ia.l lVar = anonymousClass2;
                        kotlin.jvm.internal.i.b(dialogInterface);
                        ((MainActivity$setupObservers$18.AnonymousClass2) lVar).invoke(dialogInterface);
                    }
                }).j(mainActivity.getResources().getString(R.string.common_open_app), new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.activity.h
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        boolean z10 = MainActivity.f33531Q;
                        ((MainActivity$setupObservers$18.AnonymousClass1) anonymousClass1).invoke();
                    }
                }).h(new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.ui.activity.i
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        boolean z10 = MainActivity.f33531Q;
                        ((MainActivity$setupObservers$18.AnonymousClass2) anonymousClass2).invoke(dialogInterface);
                    }
                }).show();
                return p293xa.r.f47939a;
            }
        }));
        B().f33609Q0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$19
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                MainActivity mainActivity = this.this$0;
                if (mainActivity.f33546O == null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("key_title", R.string.redirect_vag_to_main_alert_title);
                    bundle2.putInt("key_message", R.string.redirect_vag_to_main_alert_description);
                    bundle2.putInt("key_positive_text", R.string.redirect_vag_to_main_alert_button_main);
                    bundle2.putInt("key_negative_text", R.string.redirect_vag_to_main_alert_button_stay);
                    bundle2.putInt("key_learn_more_text", R.string.redirect_vag_to_main_alert_button_learn_more);
                    bundle2.putString("key_tag", "VagRedirectDialog");
                    d1 d1Var = new d1();
                    d1Var.setArguments(bundle2);
                    d1Var.f32261r = mainActivity.getSupportFragmentManager();
                    mainActivity.f33546O = d1Var;
                    d1Var.A();
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f33613S0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$20
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                sfdWizardFullScreenDialog.F(null);
                sfdWizardFullScreenDialog.v(this.this$0.getSupportFragmentManager(), "SfdWizardFullScreenDialog");
                return p293xa.r.f47939a;
            }
        }));
        B().f33617U0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$21
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                new F5.b(this.this$0, R.style.DialogTheme).k(R.string.dialog_sfd_temporarily_unavailable_title).b(R.string.dialog_sfd_temporarily_unavailable_message).i(R.string.common_ok, null).show();
                return p293xa.r.f47939a;
            }
        }));
        B().f33621W0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$22
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                com.voltasit.obdeleven.presentation.dialogs.g gVar = new com.voltasit.obdeleven.presentation.dialogs.g(0);
                y supportFragmentManager = this.this$0.getSupportFragmentManager();
                kotlin.jvm.internal.i.d(supportFragmentManager, "getSupportFragmentManager(...)");
                gVar.f32261r = supportFragmentManager;
                gVar.v(supportFragmentManager, gVar.f32263s);
                return p293xa.r.f47939a;
            }
        }));
        B().f33597K0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$23
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                Dialog dialog;
                ForceChangePasswordDialog forceChangePasswordDialog = this.this$0.f33545N;
                if (forceChangePasswordDialog == null || (dialog = forceChangePasswordDialog.f17606m) == null || !dialog.isShowing()) {
                    MainActivity mainActivity = this.this$0;
                    ForceChangePasswordDialog forceChangePasswordDialog2 = new ForceChangePasswordDialog();
                    forceChangePasswordDialog2.f32261r = null;
                    mainActivity.f33545N = forceChangePasswordDialog2;
                    MainActivity mainActivity2 = this.this$0;
                    ForceChangePasswordDialog forceChangePasswordDialog3 = mainActivity2.f33545N;
                    if (forceChangePasswordDialog3 != null) {
                        y supportFragmentManager = mainActivity2.getSupportFragmentManager();
                        kotlin.jvm.internal.i.d(supportFragmentManager, "getSupportFragmentManager(...)");
                        forceChangePasswordDialog3.v(supportFragmentManager, "ForcePasswordChange");
                    }
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f33601M0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$24
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                this.this$0.S();
                P.b(this.this$0, R.string.login_session_expired_message);
                return p293xa.r.f47939a;
            }
        }));
        B().f33625Y0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupObservers$25
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                MainActivity mainActivity = this.this$0;
                if (mainActivity.f33547P == null) {
                    mainActivity.f33547P = new BoomboardingDialog();
                    MainActivity mainActivity2 = this.this$0;
                    BoomboardingDialog boomboardingDialog = mainActivity2.f33547P;
                    if (boomboardingDialog != null) {
                        boomboardingDialog.v(mainActivity2.getSupportFragmentManager(), "BoomboardingDialog");
                    }
                }
                return p293xa.r.f47939a;
            }
        }));
        B().f33662y0.e(this, new b(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupNavigation$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Boolean bool) {
                MainActivity mainActivity = this.this$0;
                Bundle bundle2 = new Bundle();
                t tVar = new t(this.this$0);
                DeviceSelectionSheet deviceSelectionSheet = new DeviceSelectionSheet();
                deviceSelectionSheet.setArguments(bundle2);
                deviceSelectionSheet.f33918u = tVar;
                kotlin.jvm.internal.i.b(mainActivity);
                deviceSelectionSheet.f33991r = mainActivity.getSupportFragmentManager();
                deviceSelectionSheet.w();
                return p293xa.r.f47939a;
            }
        }));
        B().f33585E0.e(this, new b(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$setupNavigation$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                this.this$0.O(false);
                G.a(this.this$0, true);
                return p293xa.r.f47939a;
            }
        }));
        B().f33650s.b(this);
        B().f33650s.c(this);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f33540I = bundle.getBoolean("isLanguageSetup");
            this.f33569y = bundle.getBoolean("EnableTwoFactor");
        }
        if (getIntent().getBooleanExtra("SignedOutSnackBar", false)) {
            P.d(this, R.string.snackbar_youve_been_signed_out, R.string.common_sign_in, new n(this, i11));
        }
        this.f33535D = true;
        w().e("MainActivity", "onCreate() with orientation: ".concat(E() ? "landscape" : "portrait"));
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        int iD = com.voltasit.obdeleven.a.C0320a.a(this).d("workshopNumber", 12345);
        O.e.j("WorkshopNumberProvider", "setWorkshopNumber(" + iD + ")");
        I.b.f3749a = iD;
        boolean booleanExtra = getIntent().getBooleanExtra("EnableTwoFactor", false);
        this.f33568x = booleanExtra;
        if (!(booleanExtra ^ this.f33569y)) {
            final L l10 = new L(new I4.e(this));
            Intent intent = getIntent();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("pushData") : null;
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            String string = bundleExtra.getString("com.parse.Data");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    P8.c.b(e10);
                    jSONObject = new JSONObject();
                }
                String strOptString = jSONObject.optString("type");
                NotificationType.f30491b.getClass();
                if (NotificationType.a.a(strOptString) == NotificationType.APP_UPDATE) {
                    String objectId = jSONObject.optString("vehicleBaseId");
                    final String strOptString2 = jSONObject.optString("make");
                    if (!TextUtils.isEmpty(objectId)) {
                        int i12 = p255u9.D.f47458b;
                        kotlin.jvm.internal.i.e(objectId, "objectId");
                        ParseQuery query = ParseQuery.getQuery(p255u9.D.class);
                        query.whereEqualTo("objectId", objectId);
                        query.setLimit(1);
                        p279w9.d.a(query, null, new w9.d.b() { // from class: r9.K
                            @Override // w9.d.b
                            public final void g(List list2, ParseException parseException) {
                                L l11 = l10;
                                if (list2.isEmpty()) {
                                    return;
                                }
                                p255u9.D d10 = (p255u9.D) list2.get(0);
                                e eVar = l11.f46423a;
                                boolean z10 = MainActivity.f33531Q;
                                MainActivity this$0 = (MainActivity) eVar.f3849b;
                                i.e(this$0, "this$0");
                                if (this$0.f33535D) {
                                    int i13 = z.f47484b;
                                    if (((z) ParseUser.getCurrentUser()) != null) {
                                        Application.f29634b.c(a.f47811h);
                                        p195p9.a aVar = new p195p9.a();
                                        E e11 = new E();
                                        aVar.f31234s = e11;
                                        e11.put("vehicleBase", d10);
                                        aVar.f31235t = true;
                                        aVar.f45931A = strOptString2;
                                        NavigationManager navigationManager = this$0.f33533B;
                                        i.b(navigationManager);
                                        navigationManager.n(aVar, null);
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
        MainActivityViewModel mainActivityViewModelB = B();
        mainActivityViewModelB.getClass();
        mainActivityViewModelB.f33652t.f("MainActivityViewModel", "createBluetoothConnectionHelper()");
        C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$createBluetoothConnectionHelper$1(mainActivityViewModelB, this, null), 2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Drawable drawable = getResources().getDrawable(R.drawable.background);
        kotlin.jvm.internal.i.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setGradientRadius(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
        getWindow().setBackgroundDrawable(gradientDrawable);
        setContentView(R.layout.activity_main);
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        kotlin.jvm.internal.i.d(childAt, "getChildAt(...)");
        C4.b bVar = new C4.b(10);
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = O.f16859a;
        O.d.u(childAt, bVar);
        ((ComposeView) findViewById(R.id.composeView)).setContent(new ComposableLambdaImpl(true, 374118505, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.ui.activity.MainActivity$onCreate$1$1
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    MainActivityViewKt.a(this.this$0.B(), interfaceC1084f2, 8);
                }
                return p293xa.r.f47939a;
            }
        }));
        this.f33552g = (FrameLayout) findViewById(R.id.mainActivity_menuContainer);
        this.f33553h = (FrameLayout) findViewById(R.id.mainActivity_contentContainer);
        FrameLayout frameLayout = this.f33552g;
        kotlin.jvm.internal.i.b(frameLayout);
        FrameLayout frameLayout2 = this.f33553h;
        kotlin.jvm.internal.i.b(frameLayout2);
        this.f33533B = new NavigationManager(this, frameLayout, frameLayout2);
        MainActivityViewModel mainActivityViewModelB2 = B();
        NavigationManager navigationManager = this.f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        mainActivityViewModelB2.getClass();
        mainActivityViewModelB2.f33629b0 = navigationManager;
        this.j = (Toolbar) findViewById(R.id.mainActivity_toolbar);
        this.f33555k = (DrawerLayout) findViewById(R.id.mainActivity_drawerLayout);
        this.f33556l = (ImageView) findViewById(R.id.mainActivity_background);
        this.f33557m = (TextView) findViewById(R.id.mainActivity_connectionStatus);
        this.f33558n = (TextView) findViewById(R.id.mainActivity_credits);
        this.f33559o = (NavigationView) findViewById(R.id.mainActivity_navigationView);
        setSupportActionBar(this.j);
        p100i.c cVar = new p100i.c(this, this.f33555k, this.j);
        DrawerLayout drawerLayout = this.f33555k;
        kotlin.jvm.internal.i.b(drawerLayout);
        drawerLayout.a(cVar);
        DrawerLayout drawerLayout2 = cVar.f36274b;
        View viewF = drawerLayout2.f(8388611);
        if (viewF != null ? DrawerLayout.o(viewF) : false) {
            cVar.d(1.0f);
        } else {
            cVar.d(0.0f);
        }
        View viewF2 = drawerLayout2.f(8388611);
        int i13 = viewF2 != null ? DrawerLayout.o(viewF2) : false ? cVar.f36277e : cVar.f36276d;
        boolean z10 = cVar.f36278f;
        i.c.a aVar = cVar.f36273a;
        if (!z10 && !aVar.a()) {
            cVar.f36278f = true;
        }
        aVar.c(cVar.f36275c, i13);
        NavigationView navigationView = this.f33559o;
        kotlin.jvm.internal.i.b(navigationView);
        navigationView.setNavigationItemSelectedListener(this);
        NavigationView navigationView2 = this.f33559o;
        kotlin.jvm.internal.i.b(navigationView2);
        View childAt2 = navigationView2.j.f4300c.getChildAt(0);
        kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout3 = (FrameLayout) childAt2;
        this.f33560p = frameLayout3;
        this.f33561q = (ImageView) frameLayout3.findViewById(R.id.navigationDrawer_background);
        FrameLayout frameLayout4 = this.f33560p;
        kotlin.jvm.internal.i.b(frameLayout4);
        this.f33562r = (ImageView) frameLayout4.findViewById(R.id.navigationDrawer_image);
        FrameLayout frameLayout5 = this.f33560p;
        kotlin.jvm.internal.i.b(frameLayout5);
        this.f33563s = (TextView) frameLayout5.findViewById(R.id.navigationDrawer_username);
        FrameLayout frameLayout6 = this.f33560p;
        kotlin.jvm.internal.i.b(frameLayout6);
        this.f33564t = (TextView) frameLayout6.findViewById(R.id.navigationDrawerSubscriptionType);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Drawable drawable2 = getResources().getDrawable(R.drawable.navigation_drawer_background);
        kotlin.jvm.internal.i.c(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable2;
        gradientDrawable2.setGradientRadius(Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels));
        FrameLayout frameLayout7 = this.f33560p;
        kotlin.jvm.internal.i.b(frameLayout7);
        frameLayout7.setBackground(gradientDrawable2);
        FrameLayout frameLayout8 = this.f33560p;
        kotlin.jvm.internal.i.b(frameLayout8);
        frameLayout8.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.u(i10, this));
        F();
        MainActivityViewModel mainActivityViewModelB3 = B();
        int i14 = Build.VERSION.SDK_INT;
        com.voltasit.obdeleven.domain.usecases.permissions.b bVar2 = mainActivityViewModelB3.f33606P;
        if (i14 < 33) {
            bVar2.getClass();
        } else {
            J8.d dVar = bVar2.f30906a;
            if (p186p0.a.a(dVar.d(), "android.permission.POST_NOTIFICATIONS") != 0) {
                ((Activity) dVar.d()).requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 2);
            }
        }
        int i15 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        String sessionToken = zVar != null ? zVar.getSessionToken() : null;
        Parse.f34394a.f34437a = sessionToken;
        if (sessionToken == null) {
            sessionToken = "";
        }
        mainActivityViewModelB3.f33598L.a(sessionToken);
        z zVar2 = (z) ParseUser.getCurrentUser();
        if (zVar2 != null) {
            zVar2.put("appVersion", 10800);
            mainActivityViewModelB3.f33659x.a();
        }
        K8.o oVar = mainActivityViewModelB3.f33622X.f31091a;
        boolean zA = oVar.A();
        if (!zA) {
            oVar.t();
        }
        if (!zA) {
            mainActivityViewModelB3.f33623X0.j(p293xa.r.f47939a);
        }
        S();
        w().e("MainActivity", "setupLanguage()");
        if (!this.f33540I) {
            this.f33540I = true;
            Locale locale = getResources().getConfiguration().getLocales().get(0);
            w().e("MainActivity", "Current app locale: " + locale.getDisplayName());
            List<String> list2 = com.voltasit.obdeleven.a.f29638c;
            final com.voltasit.obdeleven.a aVarA = com.voltasit.obdeleven.a.C0320a.a(this);
            try {
                ApplicationLanguage.valueOf(aVarA.a("applicationLanguage", ""));
            } catch (IllegalArgumentException unused) {
                String lang = ApplicationLanguage.a(locale.getLanguage(), locale.getCountry()).name();
                kotlin.jvm.internal.i.e(lang, "lang");
                aVarA.o("applicationLanguage", lang);
            }
            ApplicationLanguage applicationLanguageA = ApplicationLanguage.a(locale.getLanguage(), locale.getCountry());
            P("");
            Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.ui.activity.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z11 = MainActivity.f33531Q;
                    com.voltasit.obdeleven.a aVar2 = aVarA;
                    O.e.j(Constants.BRAZE_PUSH_CONTENT_KEY, "updatePrefs()");
                    try {
                        int i16 = z.f47484b;
                        if (((z) ParseUser.getCurrentUser()) == null) {
                            return null;
                        }
                        z zVar3 = (z) ParseUser.getCurrentUser();
                        kotlin.jvm.internal.i.b(zVar3);
                        zVar3.fetch();
                        z zVar4 = (z) ParseUser.getCurrentUser();
                        kotlin.jvm.internal.i.b(zVar4);
                        JSONObject jSONObjectA = zVar4.a();
                        Iterator<String> itKeys = jSONObjectA.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            kotlin.jvm.internal.i.b(next);
                            if (kotlin.text.m.I(next, "parse_", false)) {
                                itKeys.remove();
                            }
                        }
                        int i17 = z.f47484b;
                        z zVar5 = (z) ParseUser.getCurrentUser();
                        kotlin.jvm.internal.i.b(zVar5);
                        zVar5.put("settings", jSONObjectA);
                        Iterator<String> itKeys2 = jSONObjectA.keys();
                        while (itKeys2.hasNext()) {
                            aVar2.p(jSONObjectA, itKeys2);
                        }
                        int i18 = z.f47484b;
                        z zVar6 = (z) ParseUser.getCurrentUser();
                        kotlin.jvm.internal.i.b(zVar6);
                        zVar6.saveInBackground();
                        return null;
                    } catch (ParseException e11) {
                        O.e.m(e11);
                        return null;
                    }
                }
            }).continueWith(new s(aVarA, this, applicationLanguageA), Task.UI_THREAD_EXECUTOR);
        }
        UserTrackingUtils.c(UserTrackingUtils.Key.f34265i, 1);
        ImageView imageView = this.f33556l;
        kotlin.jvm.internal.i.b(imageView);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.voltasit.obdeleven.ui.activity.l
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xa.g] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z11 = MainActivity.f33531Q;
                MainActivity this$0 = this.f33680b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                J8.h hVar = (J8.h) this$0.f33549d.getValue();
                ImageView imageView2 = this$0.f33556l;
                kotlin.jvm.internal.i.b(imageView2);
                int width = imageView2.getWidth();
                ImageView imageView3 = this$0.f33556l;
                kotlin.jvm.internal.i.b(imageView3);
                hVar.c(new J8.h.a(width, imageView3.getHeight()));
            }
        });
        FrameLayout frameLayout9 = this.f33560p;
        kotlin.jvm.internal.i.b(frameLayout9);
        frameLayout9.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.voltasit.obdeleven.ui.activity.m
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xa.g] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z11 = MainActivity.f33531Q;
                MainActivity this$0 = this.f33681b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                J8.h hVar = (J8.h) this$0.f33549d.getValue();
                FrameLayout frameLayout10 = this$0.f33560p;
                kotlin.jvm.internal.i.b(frameLayout10);
                int width = frameLayout10.getWidth();
                FrameLayout frameLayout11 = this$0.f33560p;
                kotlin.jvm.internal.i.b(frameLayout11);
                hVar.a(new J8.h.a(width, frameLayout11.getHeight()));
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.main, menu);
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (zVar == null) {
            return super.onCreateOptionsMenu(menu);
        }
        int i11 = zVar.getInt("role");
        if (i11 == 2 || i11 == 3) {
            menu.findItem(R.id.action_reset_fw).setVisible(true);
        }
        menu.findItem(R.id.action_test).setVisible(B().f33648r.C(UserPermission.TEST_BUTTON));
        menu.findItem(R.id.action_device_password_reset).setVisible(B().f33648r.C(UserPermission.RESET_DEVICE_PASSWORD));
        menu.findItem(R.id.action_report_error).setVisible(B().f33648r.C(UserPermission.REPORT_ERROR));
        p100i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
            String str = this.f33565u;
            if (str != null) {
                supportActionBar.s(str);
            }
        }
        return true;
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onDestroy() {
        w().f("MainActivity", "MainActivity onDestroy()");
        f33531Q = false;
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (zVar != null && UserTrackingUtils.f34238a.b("update_statistics", false)) {
            Task.callInBackground(new S(zVar));
        }
        this.f33535D = false;
        this.f33534C = false;
        if (W7.c.d()) {
            w().b("MainActivity", "Destroying main activity with active connection");
            W7.c.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.i.e(item, "item");
        switch (item.getItemId()) {
            case R.id.action_report_error /* 2131361866 */:
                Bundle bundle = new Bundle();
                bundle.putInt("key_title", R.string.common_report_error);
                bundle.putInt("key_input_type", 1);
                bundle.putInt("key_input_hint", R.string.common_description);
                bundle.putInt("key_positive_text", R.string.common_report);
                bundle.putInt("key_negative_text", R.string.common_cancel);
                C2183z0 c2183z0 = new C2183z0();
                c2183z0.setArguments(bundle);
                c2183z0.f32261r = getSupportFragmentManager();
                c2183z0.A();
                break;
            case R.id.action_reset_fw /* 2131361867 */:
                try {
                    if (W7.c.f7066d == null) {
                        throw new OBDelevenException(0);
                    }
                    new com.obdeleven.service.core.gen1.j().a().continueWith(new r(this), Task.UI_THREAD_EXECUTOR);
                } catch (OBDelevenException unused) {
                    P.a(this, "Device not connected");
                }
                break;
            case R.id.action_test /* 2131361868 */:
                w().e("MainActivity", "Token: " + ParseUser.getCurrentUser().getSessionToken());
                P.a(this, "Test event sent.");
                ControlUnitDB controlUnitDB = new ControlUnitDB();
                HistoryDB historyDB = new HistoryDB();
                historyDB.i(controlUnitDB);
                historyDB.saveInBackground();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onPause() {
        Application application;
        w().f("MainActivity", "MainActivity onPause()");
        super.onPause();
        this.f33534C = false;
        CreditUtils.f34225a.remove(this);
        W7.c.f(this);
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - this.f33532A;
        UserTrackingUtils.Key key = UserTrackingUtils.Key.f34266k;
        synchronized (UserTrackingUtils.class) {
            try {
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null) {
                    if (key.b() != null && (application = UserTrackingUtils.f34239b) != null) {
                        FirebaseAnalytics.getInstance(application).a(null, key.b());
                    }
                    if (key.e() != null) {
                        String str = "parse_" + key.e();
                        com.voltasit.obdeleven.a aVar = UserTrackingUtils.f34238a;
                        aVar.m(aVar.e(str) + timeInMillis, str);
                        SharedPreferences.Editor editorF = UserTrackingUtils.f34238a.f();
                        if (editorF != null) {
                            editorF.putBoolean("update_statistics", true);
                            editorF.apply();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((com.voltasit.obdeleven.data.providers.q) this.f33551f.getValue()).getClass();
        BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.i.e(permissions, "permissions");
        kotlin.jvm.internal.i.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        MainActivityViewModel mainActivityViewModelB = B();
        mainActivityViewModelB.getClass();
        BluetoothConnectionHelper bluetoothConnectionHelper = mainActivityViewModelB.f33628a0;
        if (bluetoothConnectionHelper == null) {
            mainActivityViewModelB.j.j(mainActivityViewModelB.f33650s.a(R.string.common_check_network, new Object[0]));
            mainActivityViewModelB.f33652t.c("MainActivityViewModel", "Blutooth provider not initialized on permission result");
            return;
        }
        if (i10 == 201) {
            if (grantResults.length != 0 && grantResults[0] == 0) {
                bluetoothConnectionHelper.a();
            } else {
                P.b(bluetoothConnectionHelper.f34294a, R.string.snackbar_cant_access_bluetooth);
                W7.c.g(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onResume() {
        w().f("MainActivity", "MainActivity onResume()");
        super.onResume();
        int i10 = 1;
        this.f33535D = true;
        this.f33534C = true;
        this.f33536E = false;
        w().e("MainActivity", "onResume() called");
        boolean z10 = this.f33568x && !this.f33569y;
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (powerManager == null ? true : powerManager.isInteractive()) {
            NavigationManager navigationManager = this.f33533B;
            kotlin.jvm.internal.i.b(navigationManager);
            if (navigationManager.f34236g.isEmpty()) {
                this.f33569y = this.f33568x;
                NavigationManager navigationManager2 = this.f33533B;
                kotlin.jvm.internal.i.b(navigationManager2);
                navigationManager2.o(z10);
            }
        }
        MainActivityViewModel mainActivityViewModelB = B();
        mainActivityViewModelB.getClass();
        C2680e.c(Z.a(mainActivityViewModelB), null, null, new MainActivityViewModel$onResume$1(mainActivityViewModelB, null), 3);
        this.f33532A = Calendar.getInstance().getTimeInMillis();
        int i11 = z.f47484b;
        if (((z) ParseUser.getCurrentUser()) != null) {
            ParseSession.getCurrentSessionInBackground().continueWith(new com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.e(i10, this), Task.UI_THREAD_EXECUTOR);
        }
        MainActivityViewModel mainActivityViewModelB2 = B();
        G8.v vVarW = mainActivityViewModelB2.f33644p.W();
        String strB = J4.i.b(vVarW.f3545a, "Checking for update. Current version: 10800. Min required: ");
        J8.p pVar = mainActivityViewModelB2.f33652t;
        pVar.e("MainActivityViewModel", strB);
        if (10800 < vVarW.f3545a) {
            mainActivityViewModelB2.f33637j0.j(Boolean.TRUE);
        } else {
            if (10800 < vVarW.f3546b) {
                mainActivityViewModelB2.f33639l0.j(Boolean.TRUE);
            }
            pVar.e("MainActivityViewModel", "Checking for weak password");
            if (((G8.D) mainActivityViewModelB2.f33610R.f31003a.A().getValue()).f3412c) {
                mainActivityViewModelB2.f33595J0.j(p293xa.r.f47939a);
            }
        }
        ArrayList arrayList = CreditUtils.f34225a;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        y();
        e(W7.c.c());
        W7.c.a(this);
        if (this.f33567w) {
            w().e("MainActivity", "Popping all back stack");
            this.f33567w = false;
            NavigationManager navigationManager3 = this.f33533B;
            kotlin.jvm.internal.i.b(navigationManager3);
            navigationManager3.o(false);
        }
        Dialog dialog = this.f33538G;
        if (dialog != null) {
            dialog.show();
            this.f33538G = null;
        }
        BonusDialog bonusDialog = this.f33537F;
        if (bonusDialog != null) {
            bonusDialog.A();
            this.f33537F = null;
        }
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        Iterator it = Q8.b.a.a(com.voltasit.obdeleven.a.C0320a.a(this).a("device_list", "")).iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(((Q8.b) it.next()).f5131f)) {
                i10 = 0;
                break;
            }
        }
        if (i10 == 0) {
            w().b("MainActivity", "No original name in device.");
            List<String> list2 = com.voltasit.obdeleven.a.f29638c;
            com.voltasit.obdeleven.a.C0320a.a(this).o("device_list", "");
        }
        ((com.voltasit.obdeleven.data.providers.q) this.f33551f.getValue()).getClass();
        BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(this);
        boolean booleanExtra = getIntent().getBooleanExtra("ShouldShowVagRedirectAfterLogin", false);
        getIntent().removeExtra("ShouldShowVagRedirectAfterLogin");
        if (booleanExtra) {
            MainActivityViewModel mainActivityViewModelB3 = B();
            mainActivityViewModelB3.getClass();
            C2680e.c(Z.a(mainActivityViewModelB3), null, null, new MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1(mainActivityViewModelB3, null), 3);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onSaveInstanceState(Bundle savedInstanceState) {
        kotlin.jvm.internal.i.e(savedInstanceState, "savedInstanceState");
        w().f("MainActivity", "MainActivity onSaveInstanceState()");
        savedInstanceState.putBoolean("isLanguageSetup", this.f33540I);
        savedInstanceState.putBoolean("EnableTwoFactor", this.f33569y);
        super.onSaveInstanceState(savedInstanceState);
        this.f33536E = true;
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onStop() {
        w().f("MainActivity", "MainActivity onStop()");
        super.onStop();
        this.f33535D = false;
    }

    @p293xa.d
    public final void x() {
        MainActivityViewModel mainActivityViewModelB = B();
        BluetoothConnectionHelper bluetoothConnectionHelper = mainActivityViewModelB.f33628a0;
        if (bluetoothConnectionHelper != null) {
            bluetoothConnectionHelper.a();
            return;
        }
        mainActivityViewModelB.j.j(mainActivityViewModelB.f33650s.a(R.string.common_check_network, new Object[0]));
        mainActivityViewModelB.f33652t.c("MainActivityViewModel", "Blutooth provider not initialized on connect");
    }

    public final void y() {
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (zVar == null) {
            TextView textView = this.f33558n;
            kotlin.jvm.internal.i.b(textView);
            textView.setText("");
            return;
        }
        TextView textView2 = this.f33558n;
        kotlin.jvm.internal.i.b(textView2);
        textView2.setText(String.valueOf(zVar.getInt("credits")));
        ArrayList arrayList = CreditUtils.f34225a;
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "CreditUtils", "get()", Arrays.copyOf(new Object[0], 0));
        z zVar2 = (z) ParseUser.getCurrentUser();
        if (zVar2 == null) {
            kotlin.jvm.internal.i.d(Task.forError(new CreditUtils.CreditsException()), "forError(...)");
        } else {
            kotlin.jvm.internal.i.d(zVar2.fetchInBackground().onSuccess(new V8.k(10, zVar2)), "onSuccess(...)");
        }
    }

    public final void z(Ia.l<? super Boolean, p293xa.r> lVar) {
        this.f33544M = new MainActivity$enableBluetooth$1(lVar);
        this.f33543L.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
    }
}
