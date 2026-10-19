package p165n4;

import X5.ViewOnClickListenerC0832a;
import Z3.C0835a;
import Z3.q;
import Z3.r;
import Z3.x;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC1347l;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginTargetApp;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.DialogInterfaceOnCancelListenerC2135b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public class v extends Dialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile int f44936n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f44939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f44940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressDialog f44941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f44942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f44943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f44944i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WindowManager.LayoutParams f44947m;

    /* JADX INFO: compiled from: WebDialog.kt */
    public final class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f44948a;

        public a(v this$0) {
            i.e(this$0, "this$0");
            this.f44948a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            i.e(view, "view");
            i.e(url, "url");
            super.onPageFinished(view, url);
            v vVar = this.f44948a;
            if (!vVar.f44945k && (progressDialog = vVar.f44941f) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = vVar.f44943h;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            e eVar = vVar.f44940e;
            if (eVar != null) {
                eVar.setVisibility(0);
            }
            ImageView imageView = vVar.f44942g;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            vVar.f44946l = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            i.e(view, "view");
            i.e(url, "url");
            i.k(url, "Webview loading URL: ");
            q qVar = q.f7852a;
            super.onPageStarted(view, url, bitmap);
            v vVar = this.f44948a;
            if (vVar.f44945k || (progressDialog = vVar.f44941f) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
            i.e(view, "view");
            i.e(description, "description");
            i.e(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            this.f44948a.e(new FacebookDialogException(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            i.e(view, "view");
            i.e(handler, "handler");
            i.e(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f44948a.e(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            int i10;
            i.e(view, "view");
            i.e(url, "url");
            i.k(url, "Redirect URL: ");
            q qVar = q.f7852a;
            Uri uri = Uri.parse(url);
            boolean z10 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            v vVar = this.f44948a;
            if (!m.I(url, vVar.f44938c, false)) {
                if (m.I(url, "fbconnect://cancel", false)) {
                    vVar.cancel();
                    return true;
                }
                if (z10 || n.J(url, "touch", false)) {
                    return false;
                }
                try {
                    vVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            Bundle bundleC = vVar.c(url);
            String string = bundleC.getString("error");
            if (string == null) {
                string = bundleC.getString("error_type");
            }
            String string2 = bundleC.getString("error_msg");
            if (string2 == null) {
                string2 = bundleC.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleC.getString("error_description");
            }
            String string3 = bundleC.getString("error_code");
            if (string3 == null || s.y(string3)) {
                i10 = -1;
            } else {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
            }
            if (s.y(string) && s.y(string2) && i10 == -1) {
                b bVar = vVar.f44939d;
                if (bVar != null && !vVar.j) {
                    vVar.j = true;
                    bVar.b(bundleC, null);
                    vVar.dismiss();
                }
            } else if ((string == null || !(string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) && i10 != 4201) {
                vVar.e(new FacebookServiceException(new FacebookRequestError(i10, string, string2), string2));
            } else {
                vVar.cancel();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    public interface b {
        void b(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    public final class c extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f44950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception[] f44951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v f44952d;

        public c(v this$0, String str, Bundle bundle) {
            i.e(this$0, "this$0");
            this.f44952d = this$0;
            this.f44949a = str;
            this.f44950b = bundle;
            this.f44951c = new Exception[0];
        }

        /* JADX WARN: Type inference failed for: r10v0, types: [n4.w] */
        @Override // android.os.AsyncTask
        public final String[] doInBackground(Void[] voidArr) {
            Void[] p10 = voidArr;
            i.e(p10, "p0");
            String[] stringArray = this.f44950b.getStringArray("media");
            if (stringArray == null) {
                return null;
            }
            final String[] strArr = new String[stringArray.length];
            this.f44951c = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            Date date = C0835a.f7782m;
            C0835a c0835aB = C0835a.b.b();
            try {
                int length = stringArray.length - 1;
                if (length >= 0) {
                    final int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((Z3.v) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri uri = Uri.parse(stringArray[i10]);
                        if (uri == null || !("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()))) {
                            ?? r10 = new r.b() { // from class: n4.w
                                @Override // Z3.r.b
                                public final void b(x xVar) {
                                    int i12 = i10;
                                    String[] strArr2 = strArr;
                                    v.c this$0 = this;
                                    i.e(this$0, "this$0");
                                    CountDownLatch countDownLatch2 = countDownLatch;
                                    try {
                                        FacebookRequestError facebookRequestError = xVar.f7905c;
                                        String str = "Error staging photo.";
                                        if (facebookRequestError != null) {
                                            String strA = facebookRequestError.a();
                                            if (strA != null) {
                                                str = strA;
                                            }
                                            throw new FacebookGraphResponseException(xVar, str);
                                        }
                                        JSONObject jSONObject = xVar.f7904b;
                                        if (jSONObject == null) {
                                            throw new FacebookException("Error staging photo.");
                                        }
                                        String strOptString = jSONObject.optString("uri");
                                        if (strOptString == null) {
                                            throw new FacebookException("Error staging photo.");
                                        }
                                        strArr2[i12] = strOptString;
                                        countDownLatch2.countDown();
                                    } catch (Exception e10) {
                                        this$0.f44951c[i12] = e10;
                                    }
                                }
                            };
                            i.d(uri, "uri");
                            concurrentLinkedQueue.add(p287x4.a.a(c0835aB, uri, r10).d());
                        } else {
                            strArr[i10] = uri.toString();
                            countDownLatch.countDown();
                        }
                        if (i11 <= length) {
                            i10 = i11;
                        }
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Exception unused) {
                Iterator it2 = concurrentLinkedQueue.iterator();
                while (it2.hasNext()) {
                    ((Z3.v) it2.next()).cancel(true);
                }
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        public final void onPostExecute(String[] strArr) {
            String[] strArr2 = strArr;
            v vVar = this.f44952d;
            ProgressDialog progressDialog = vVar.f44941f;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Exception[] excArr = this.f44951c;
            int length = excArr.length;
            int i10 = 0;
            while (i10 < length) {
                Exception exc = excArr[i10];
                i10++;
                if (exc != null) {
                    vVar.e(exc);
                    return;
                }
            }
            if (strArr2 == null) {
                vVar.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List listH = Q3.d.h(strArr2);
            if (listH.contains(null)) {
                vVar.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) listH);
            Bundle bundle = this.f44950b;
            i.e(bundle, "bundle");
            if (jSONArray instanceof boolean[]) {
                bundle.putBooleanArray("media", (boolean[]) jSONArray);
            } else if (jSONArray instanceof double[]) {
                bundle.putDoubleArray("media", (double[]) jSONArray);
            } else if (jSONArray instanceof int[]) {
                bundle.putIntArray("media", (int[]) jSONArray);
            } else if (jSONArray instanceof long[]) {
                bundle.putLongArray("media", (long[]) jSONArray);
            } else {
                bundle.putString("media", jSONArray.toString());
            }
            vVar.f44937b = s.b(bundle, p.a(), q.d() + "/dialog/" + this.f44949a).toString();
            ImageView imageView = vVar.f44942g;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            vVar.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44953a;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[1] = 1;
            f44953a = iArr;
        }
    }

    /* JADX INFO: compiled from: WebDialog.kt */
    public static final class e extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ActivityC1347l activityC1347l, String str, Bundle bundle, LoginTargetApp loginTargetApp, b bVar) {
        Uri uriB;
        super(activityC1347l, f44936n);
        t.e();
        this.f44938c = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = s.v(activityC1347l) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f44938c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", q.b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"16.2.0"}, 1)));
        this.f44939d = bVar;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.f44944i = new c(this, str, bundle);
            return;
        }
        if (d.f44953a[loginTargetApp.ordinal()] == 1) {
            uriB = s.b(bundle, p.b(), "oauth/authorize");
        } else {
            uriB = s.b(bundle, p.a(), q.d() + "/dialog/" + ((Object) str));
        }
        this.f44937b = uriB.toString();
    }

    public static int a(int i10, float f10, int i11, int i12) {
        double d10;
        int i13 = (int) (i10 / f10);
        if (i13 <= i11) {
            d10 = 1.0d;
        } else {
            d10 = i13 >= i12 ? 0.5d : ((((double) (i12 - i13)) / ((double) (i12 - i11))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i10) * d10);
    }

    public static final void b(ActivityC1347l activityC1347l) {
        if (activityC1347l == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = activityC1347l.getPackageManager().getApplicationInfo(activityC1347l.getPackageName(), 128);
            if ((applicationInfo == null ? null : applicationInfo.metaData) != null && f44936n == 0) {
                int i10 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i10 == 0) {
                    i10 = R.style.com_facebook_activity_theme;
                }
                f44936n = i10;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleC = s.C(uri.getQuery());
        bundleC.putAll(s.C(uri.getFragment()));
        return bundleC;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f44939d == null || this.j) {
            return;
        }
        e(new FacebookOperationCanceledException());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int iMin = Math.min(a(i12, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(a(i10, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(iMin, iMin2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        e eVar = this.f44940e;
        if (eVar != null) {
            eVar.stopLoading();
        }
        if (!this.f44945k && (progressDialog = this.f44941f) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.f44939d == null || this.j) {
            return;
        }
        this.j = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        b bVar = this.f44939d;
        if (bVar != null) {
            bVar.b(null, facebookException);
        }
        dismiss();
    }

    public final void f(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        e eVar = new e(getContext());
        this.f44940e = eVar;
        eVar.setVerticalScrollBarEnabled(false);
        e eVar2 = this.f44940e;
        if (eVar2 != null) {
            eVar2.setHorizontalScrollBarEnabled(false);
        }
        e eVar3 = this.f44940e;
        if (eVar3 != null) {
            eVar3.setWebViewClient(new a(this));
        }
        e eVar4 = this.f44940e;
        WebSettings settings = eVar4 == null ? null : eVar4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        e eVar5 = this.f44940e;
        if (eVar5 != null) {
            String str = this.f44937b;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            eVar5.loadUrl(str);
        }
        e eVar6 = this.f44940e;
        if (eVar6 != null) {
            eVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        e eVar7 = this.f44940e;
        if (eVar7 != null) {
            eVar7.setVisibility(4);
        }
        e eVar8 = this.f44940e;
        WebSettings settings2 = eVar8 == null ? null : eVar8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        e eVar9 = this.f44940e;
        WebSettings settings3 = eVar9 != null ? eVar9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        e eVar10 = this.f44940e;
        if (eVar10 != null) {
            eVar10.setFocusable(true);
        }
        e eVar11 = this.f44940e;
        if (eVar11 != null) {
            eVar11.setFocusableInTouchMode(true);
        }
        e eVar12 = this.f44940e;
        if (eVar12 != null) {
            eVar12.setOnTouchListener(new u());
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f44940e);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f44943h;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f44945k = false;
        Context context = getContext();
        i.d(context, "context");
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.f44947m) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f44947m;
                i.k(layoutParams2 != null ? layoutParams2.token : null, "Set token on onAttachedToWindow(): ");
                q qVar = q.f7852a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f44941f = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f44941f;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f44941f;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f44941f;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterfaceOnCancelListenerC2135b(2, this));
        }
        requestWindowFeature(1);
        this.f44943h = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f44942g = imageView;
        imageView.setOnClickListener(new ViewOnClickListenerC0832a(5, this));
        Drawable drawable = getContext().getResources().getDrawable(2131230932);
        ImageView imageView2 = this.f44942g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f44942g;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f44937b != null) {
            ImageView imageView4 = this.f44942g;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f44943h;
        if (frameLayout != null) {
            frameLayout.addView(this.f44942g, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f44943h;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f44945k = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent event) {
        i.e(event, "event");
        if (i10 == 4) {
            e eVar = this.f44940e;
            if (eVar != null && i.a(Boolean.valueOf(eVar.canGoBack()), Boolean.TRUE)) {
                e eVar2 = this.f44940e;
                if (eVar2 == null) {
                    return true;
                }
                eVar2.goBack();
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c cVar = this.f44944i;
        if (cVar != null) {
            if ((cVar == null ? null : cVar.getStatus()) == AsyncTask.Status.PENDING) {
                if (cVar != null) {
                    cVar.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f44941f;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        c cVar = this.f44944i;
        if (cVar != null) {
            cVar.cancel(true);
            ProgressDialog progressDialog = this.f44941f;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        i.e(params, "params");
        if (params.token == null) {
            this.f44947m = params;
        }
        super.onWindowAttributesChanged(params);
    }
}
