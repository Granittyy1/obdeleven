package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ComponentDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public class q extends Dialog implements InterfaceC1376t, C, p248u2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1378v f8249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p248u2.d f8250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackPressedDispatcher f8251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.i.e(context, "context");
        this.f8250c = new p248u2.d(new p273w2.b(this, new io.intercom.android.sdk.ui.preview.ui.c(this, 1)));
        this.f8251d = new OnBackPressedDispatcher(new p(0, this));
    }

    public static void a(q qVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final C1378v b() {
        C1378v c1378v = this.f8249b;
        if (c1378v != null) {
            return c1378v;
        }
        C1378v c1378v2 = new C1378v(this);
        this.f8249b = c1378v2;
        return c1378v2;
    }

    public final void c() {
        Window window = getWindow();
        kotlin.jvm.internal.i.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window!!.decorView");
        P3.d.u(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.i.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.i.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.i.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.i.d(decorView3, "window!!.decorView");
        I2.e.p(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1376t
    public final Lifecycle getLifecycle() {
        return b();
    }

    @Override // androidx.activity.C
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f8251d;
    }

    @Override // p248u2.e
    public final p248u2.c getSavedStateRegistry() {
        return this.f8250c.f47417b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f8251d.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f8251d;
            onBackPressedDispatcher.f8187e = onBackInvokedDispatcher;
            onBackPressedDispatcher.d(onBackPressedDispatcher.f8189g);
        }
        this.f8250c.b(bundle);
        b().f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.i.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f8250c.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().f(Lifecycle.Event.ON_DESTROY);
        this.f8249b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
