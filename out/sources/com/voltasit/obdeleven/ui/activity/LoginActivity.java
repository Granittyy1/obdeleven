package com.voltasit.obdeleven.ui.activity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.y;
import com.voltasit.obdeleven.presentation.signIn.SigninFragment;
import com.voltasit.obdeleven.presentation.signIn.SignupFragment;
import com.voltasit.parse.Parse;
import java.util.List;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;
import p220r9.C2786s;

/* JADX INFO: loaded from: classes3.dex */
public class LoginActivity extends BaseActivity implements SigninFragment.a, com.voltasit.obdeleven.presentation.signIn.a.InterfaceC0345a, p303y8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33530c;

    @Override // com.voltasit.obdeleven.presentation.signIn.a.InterfaceC0345a
    public final void c() {
        getSupportFragmentManager().S();
    }

    @Override // p303y8.a
    public final void d(boolean z10) {
        if (z10) {
            setResult(R.styleable.AppCompatTheme_switchStyle);
        } else {
            setResult(-1);
        }
        Parse.b();
        finish();
    }

    @Override // com.voltasit.obdeleven.presentation.signIn.SigninFragment.a
    public final void j(String str, boolean z10) {
        if (z10) {
            getSupportFragmentManager().T(SigninFragment.class.getName(), -1, 0);
        }
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1336a c1336a = new C1336a(supportFragmentManager);
        com.voltasit.obdeleven.presentation.signIn.a aVar = new com.voltasit.obdeleven.presentation.signIn.a();
        Bundle bundle = new Bundle();
        bundle.putString("com.voltasit.obdeleven.login.EMAIL", str);
        aVar.setArguments(bundle);
        c1336a.e(com.voltasit.obdeleven.R.id.loginActivity_content, aVar, null);
        c1336a.c(null);
        c1336a.i();
    }

    @Override // com.voltasit.obdeleven.presentation.signIn.SigninFragment.a
    public final void k(String str, String str2) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1336a c1336a = new C1336a(supportFragmentManager);
        SignupFragment signupFragment = new SignupFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.voltasit.obdeleven.login.EMAIL", str);
        bundle.putString("com.voltasit.obdeleven.login.PASSWORD", str2);
        signupFragment.setArguments(bundle);
        c1336a.e(com.voltasit.obdeleven.R.id.loginActivity_content, signupFragment, null);
        c1336a.c(null);
        c1336a.i();
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(com.voltasit.obdeleven.R.layout.login_activity);
        ViewGroup view = (ViewGroup) ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        kotlin.jvm.internal.i.e(view, "view");
        C4.b bVar = new C4.b(10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(view, bVar);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(com.voltasit.obdeleven.R.drawable.background);
        gradientDrawable.setGradientRadius(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
        getWindow().setBackgroundDrawable(gradientDrawable);
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (com.voltasit.obdeleven.a.C0320a.a(this).b("is_landscape", getResources().getBoolean(com.voltasit.obdeleven.R.bool.is_tablet))) {
            findViewById(com.voltasit.obdeleven.R.id.loginActivity_content).getLayoutParams().width = (C2786s.b(this) / 40) * 25;
        }
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1336a c1336a = new C1336a(supportFragmentManager);
        c1336a.d(com.voltasit.obdeleven.R.id.loginActivity_content, new SigninFragment(), null, 1);
        c1336a.i();
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f33530c = false;
    }

    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f33530c = true;
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f33530c = false;
    }
}
