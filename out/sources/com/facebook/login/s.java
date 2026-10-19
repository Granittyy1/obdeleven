package com.facebook.login;

import Z3.C0835a;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: compiled from: LoginFragment.kt */
/* JADX INFO: loaded from: classes.dex */
public class s extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoginClient.b f25169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LoginClient f25170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p063f.c<Intent> f25171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f25172f;

    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class a {
        public a() {
        }
    }

    public final LoginClient o() {
        LoginClient loginClient = this.f25170d;
        if (loginClient != null) {
            return loginClient;
        }
        kotlin.jvm.internal.i.m("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        o().j(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClient = bundle == null ? null : (LoginClient) bundle.getParcelable("loginClient");
        if (loginClient == null) {
            loginClient = new LoginClient();
            loginClient.f25056c = -1;
            if (loginClient.f25057d != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f25057d = this;
        } else {
            if (loginClient.f25057d != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f25057d = this;
        }
        this.f25170d = loginClient;
        o().f25058e = new r(this);
        final ActivityC1347l activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f25168b = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f25169c = (LoginClient.b) bundleExtra.getParcelable("request");
        }
        p063f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new p076g.d(), new S6.i(3, new Ia.l<p063f.a, p293xa.r>() { // from class: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p063f.a aVar) {
                p063f.a result = aVar;
                kotlin.jvm.internal.i.e(result, "result");
                int i10 = result.f34886b;
                if (i10 == -1) {
                    this.this$0.o().j(CallbackManagerImpl.RequestCodeOffset.Login.a(), i10, result.f34887c);
                } else {
                    activity.finish();
                }
                return p293xa.r.f47939a;
            }
        }));
        kotlin.jvm.internal.i.d(cVarRegisterForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f25171e = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.i.d(viewFindViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f25172f = viewFindViewById;
        o().f25059f = new a();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        x xVarF = o().f();
        if (xVarF != null) {
            xVarF.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f25168b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            ActivityC1347l activity = getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        LoginClient loginClientO = o();
        LoginClient.b bVar = this.f25169c;
        LoginClient.b bVar2 = loginClientO.f25061h;
        if ((bVar2 == null || loginClientO.f25056c < 0) && bVar != null) {
            if (bVar2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = C0835a.f7782m;
            if (!C0835a.b.c() || loginClientO.b()) {
                loginClientO.f25061h = bVar;
                ArrayList arrayList = new ArrayList();
                boolean zA = bVar.a();
                LoginBehavior loginBehavior = bVar.f25078b;
                if (!zA) {
                    if (loginBehavior.c()) {
                        arrayList.add(new o(loginClientO));
                    }
                    if (!Z3.q.f7865o && loginBehavior.e()) {
                        arrayList.add(new q(loginClientO));
                    }
                } else if (!Z3.q.f7865o && loginBehavior.d()) {
                    arrayList.add(new p(loginClientO));
                }
                if (loginBehavior.a()) {
                    arrayList.add(new C1770b(loginClientO));
                }
                if (loginBehavior.f()) {
                    arrayList.add(new C(loginClientO));
                }
                if (!bVar.a() && loginBehavior.b()) {
                    arrayList.add(new l(loginClientO));
                }
                Object[] array = arrayList.toArray(new x[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                loginClientO.f25055b = (x[]) array;
                loginClientO.k();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", o());
    }
}
