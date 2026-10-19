package com.facebook.login;

import Z3.C0835a;
import Z3.I;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceAuthDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public class k extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f25128A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LoginClient.b f25129B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f25130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f25131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f25132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f25133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f25134v = new AtomicBoolean();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Z3.v f25135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile ScheduledFuture<?> f25136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile c f25137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f25138z;

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    public static final class a {
        public static final b a(JSONObject jSONObject) throws JSONException {
            String strOptString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    String permission = jSONObjectOptJSONObject.optString("permission");
                    kotlin.jvm.internal.i.d(permission, "permission");
                    if (permission.length() != 0 && !permission.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                        int iHashCode = strOptString.hashCode();
                        if (iHashCode != -1309235419) {
                            if (iHashCode != 280295099) {
                                if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (strOptString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (strOptString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            b bVar = new b();
            bVar.f25139a = arrayList;
            bVar.f25140b = arrayList2;
            bVar.f25141c = arrayList3;
            return bVar;
        }
    }

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f25139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f25140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f25141c;
    }

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f25144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25146f;

        /* JADX INFO: compiled from: DeviceAuthDialog.kt */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                c cVar = new c();
                cVar.f25142b = parcel.readString();
                cVar.f25143c = parcel.readString();
                cVar.f25144d = parcel.readString();
                cVar.f25145e = parcel.readLong();
                cVar.f25146f = parcel.readLong();
                return cVar;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeString(this.f25142b);
            dest.writeString(this.f25143c);
            dest.writeString(this.f25144d);
            dest.writeLong(this.f25145e);
            dest.writeLong(this.f25146f);
        }
    }

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    public static final class d extends Dialog {
        public d(ActivityC1347l activityC1347l) {
            super(activityC1347l, R.style.com_facebook_auth_dialog);
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            k.this.getClass();
            super.onBackPressed();
        }
    }

    public final void A(final String str, long j, Long l10) {
        final Date date;
        HttpMethod httpMethod = HttpMethod.f24771b;
        Bundle bundleD = C4.v.d("fields", "id,permissions,name");
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        final Date date2 = l10.longValue() != 0 ? new Date(l10.longValue() * 1000) : null;
        C0835a c0835a = new C0835a(str, Z3.q.b(), "0", null, null, null, null, date, null, date2, "facebook");
        String str2 = Z3.r.j;
        Z3.r rVarG = Z3.r.c.g(c0835a, "me", new Z3.r.b() { // from class: com.facebook.login.h
            @Override // Z3.r.b
            public final void b(Z3.x xVar) {
                final k this$0 = this.f25116a;
                final String str3 = str;
                final Date date3 = date;
                final Date date4 = date2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.f25134v.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = xVar.f7905c;
                if (facebookRequestError != null) {
                    FacebookException facebookException = facebookRequestError.j;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    this$0.z(facebookException);
                    return;
                }
                try {
                    JSONObject jSONObject = xVar.f7904b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    kotlin.jvm.internal.i.d(string, "jsonObject.getString(\"id\")");
                    final k.b bVarA = k.a.a(jSONObject);
                    String string2 = jSONObject.getString("name");
                    kotlin.jvm.internal.i.d(string2, "jsonObject.getString(\"name\")");
                    k.c cVar = this$0.f25137y;
                    if (cVar != null) {
                        p155m4.b bVar = p155m4.b.f44594a;
                        p155m4.b.a(cVar.f25143c);
                    }
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                    p165n4.j jVarB = FetchedAppSettingsManager.b(Z3.q.b());
                    if (!kotlin.jvm.internal.i.a(jVarB == null ? null : Boolean.valueOf(jVarB.f44897c.contains(SmartLoginOption.f25020d)), Boolean.TRUE) || this$0.f25128A) {
                        this$0.w(string, bVarA, str3, date3, date4);
                        return;
                    }
                    this$0.f25128A = true;
                    String string3 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                    kotlin.jvm.internal.i.d(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                    String string4 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                    kotlin.jvm.internal.i.d(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                    String string5 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                    kotlin.jvm.internal.i.d(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                    String str4 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                    AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.facebook.login.i
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            k this$1 = this$0;
                            kotlin.jvm.internal.i.e(this$1, "this$0");
                            String userId = string;
                            kotlin.jvm.internal.i.e(userId, "$userId");
                            k.b permissions = bVarA;
                            kotlin.jvm.internal.i.e(permissions, "$permissions");
                            String accessToken = str3;
                            kotlin.jvm.internal.i.e(accessToken, "$accessToken");
                            this$1.w(userId, permissions, accessToken, date3, date4);
                        }
                    }).setPositiveButton(string5, new j(this$0, 0));
                    builder.create().show();
                } catch (JSONException e10) {
                    this$0.z(new FacebookException(e10));
                }
            }
        });
        rVarG.f7880h = httpMethod;
        rVarG.f7876d = bundleD;
        rVarG.d();
    }

    public final void B() {
        c cVar = this.f25137y;
        if (cVar != null) {
            cVar.f25146f = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        c cVar2 = this.f25137y;
        bundle.putString("code", cVar2 == null ? null : cVar2.f25144d);
        StringBuilder sb2 = new StringBuilder();
        int i10 = p165n4.t.f44935a;
        sb2.append(Z3.q.b());
        sb2.append('|');
        p165n4.t.e();
        String str = Z3.q.f7857f;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str);
        bundle.putString("access_token", sb2.toString());
        String str2 = Z3.r.j;
        this.f25135w = new Z3.r(null, "device/login_status", bundle, HttpMethod.f24772c, new Z3.r.b() { // from class: com.facebook.login.f
            @Override // Z3.r.b
            public final void b(Z3.x xVar) {
                k this$0 = this.f25114a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.f25134v.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = xVar.f7905c;
                if (facebookRequestError == null) {
                    try {
                        JSONObject jSONObject = xVar.f7904b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        kotlin.jvm.internal.i.d(string, "resultObject.getString(\"access_token\")");
                        this$0.A(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e10) {
                        this$0.z(new FacebookException(e10));
                        return;
                    }
                }
                int i11 = facebookRequestError.f24761d;
                if (i11 == 1349174 || i11 == 1349172) {
                    this$0.C();
                    return;
                }
                if (i11 != 1349152) {
                    if (i11 == 1349173) {
                        this$0.y();
                        return;
                    }
                    FacebookException facebookException = facebookRequestError.j;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    this$0.z(facebookException);
                    return;
                }
                k.c cVar3 = this$0.f25137y;
                if (cVar3 != null) {
                    p155m4.b bVar = p155m4.b.f44594a;
                    p155m4.b.a(cVar3.f25143c);
                }
                LoginClient.b bVar2 = this$0.f25129B;
                if (bVar2 != null) {
                    this$0.E(bVar2);
                } else {
                    this$0.y();
                }
            }
        }, 32).d();
    }

    public final void C() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        c cVar = this.f25137y;
        Long lValueOf = cVar == null ? null : Long.valueOf(cVar.f25145e);
        if (lValueOf != null) {
            synchronized (l.f25148e) {
                try {
                    if (l.f25149f == null) {
                        l.f25149f = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = l.f25149f;
                    if (scheduledThreadPoolExecutor == null) {
                        kotlin.jvm.internal.i.m("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f25136x = scheduledThreadPoolExecutor.schedule(new e(0, this), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    public final void D(c cVar) {
        Bitmap bitmapCreateBitmap;
        this.f25137y = cVar;
        TextView textView = this.f25131s;
        if (textView == null) {
            kotlin.jvm.internal.i.m("confirmationCode");
            throw null;
        }
        textView.setText(cVar.f25143c);
        p155m4.b bVar = p155m4.b.f44594a;
        String str = cVar.f25142b;
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.f29211d, 2);
        try {
            P7.b bVarA = new R7.a().a(str, BarcodeFormat.f29207b, enumMap);
            int i10 = bVarA.f4954c;
            int i11 = bVarA.f4953b;
            int[] iArr = new int[i10 * i11];
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    int i14 = i12 * i11;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            iArr[i14 + i15] = bVarA.a(i15, i12) ? -16777216 : -1;
                            if (i16 >= i11) {
                                break;
                            } else {
                                i15 = i16;
                            }
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i10);
            } catch (WriterException unused) {
            }
        } catch (WriterException unused2) {
            bitmapCreateBitmap = null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
        TextView textView2 = this.f25132t;
        if (textView2 == null) {
            kotlin.jvm.internal.i.m("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f25131s;
        if (textView3 == null) {
            kotlin.jvm.internal.i.m("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f25130r;
        if (view == null) {
            kotlin.jvm.internal.i.m("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f25128A) {
            p155m4.b bVar2 = p155m4.b.f44594a;
            String str2 = cVar.f25143c;
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
            p165n4.j jVarB = FetchedAppSettingsManager.b(Z3.q.b());
            if (jVarB != null) {
                if (jVarB.f44897c.contains(SmartLoginOption.f25019c)) {
                    p155m4.b.f44594a.getClass();
                    HashMap<String, NsdManager.RegistrationListener> map = p155m4.b.f44595b;
                    if (!map.containsKey(str2)) {
                        String strReplace = "16.2.0".replace('.', '|');
                        kotlin.jvm.internal.i.d(strReplace, "replace(...)");
                        String str3 = "fbsdk_" + kotlin.jvm.internal.i.k(strReplace, "android-") + '_' + ((Object) str2);
                        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
                        nsdServiceInfo.setServiceType("_fb._tcp.");
                        nsdServiceInfo.setServiceName(str3);
                        nsdServiceInfo.setPort(80);
                        Object systemService = Z3.q.a().getSystemService("servicediscovery");
                        if (systemService == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                        }
                        p155m4.a aVar = new p155m4.a(str3, str2);
                        map.put(str2, aVar);
                        ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                    }
                    p005a4.n nVar = new p005a4.n(getContext(), (String) null);
                    if (I.a()) {
                        nVar.a("fb_smart_login_service", null, null, true, p093h4.e.b());
                    }
                }
            }
        }
        if (cVar.f25146f != 0 && (new Date().getTime() - cVar.f25146f) - (cVar.f25145e * 1000) < 0) {
            C();
        } else {
            B();
        }
    }

    public final void E(LoginClient.b request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f25129B = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f25079c));
        String str = request.f25084h;
        if (!p165n4.s.y(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.j;
        if (!p165n4.s.y(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = p165n4.t.f44935a;
        sb2.append(Z3.q.b());
        sb2.append('|');
        p165n4.t.e();
        String str3 = Z3.q.f7857f;
        if (str3 == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str3);
        bundle.putString("access_token", sb2.toString());
        p155m4.b bVar = p155m4.b.f44594a;
        HashMap map = new HashMap();
        String DEVICE = Build.DEVICE;
        kotlin.jvm.internal.i.d(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.i.d(MODEL, "MODEL");
        map.put("model", MODEL);
        String string = new JSONObject(map).toString();
        kotlin.jvm.internal.i.d(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        bundle.putString("device_info", string);
        String str4 = Z3.r.j;
        new Z3.r(null, "device/login", bundle, HttpMethod.f24772c, new Z3.r.b() { // from class: com.facebook.login.g
            @Override // Z3.r.b
            public final void b(Z3.x xVar) {
                k this$0 = this.f25115a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.f25138z) {
                    return;
                }
                FacebookRequestError facebookRequestError = xVar.f7905c;
                if (facebookRequestError != null) {
                    FacebookException facebookException = facebookRequestError.j;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    this$0.z(facebookException);
                    return;
                }
                JSONObject jSONObject = xVar.f7904b;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                k.c cVar = new k.c();
                try {
                    String string2 = jSONObject.getString("user_code");
                    cVar.f25143c = string2;
                    cVar.f25142b = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                    cVar.f25144d = jSONObject.getString("code");
                    cVar.f25145e = jSONObject.getLong("interval");
                    this$0.D(cVar);
                } catch (JSONException e10) {
                    this$0.z(new FacebookException(e10));
                }
            }
        }, 32).d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        kotlin.jvm.internal.i.e(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        s sVar = (s) ((FacebookActivity) requireActivity()).f24756b;
        this.f25133u = (l) (sVar == null ? null : sVar.o().f());
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            D(cVar);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f25138z = true;
        this.f25134v.set(true);
        super.onDestroyView();
        Z3.v vVar = this.f25135w;
        if (vVar != null) {
            vVar.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.f25136x;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.i.e(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f25138z) {
            return;
        }
        y();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f25137y != null) {
            outState.putParcelable("request_state", this.f25137y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        boolean z10;
        d dVar = new d(requireActivity());
        p155m4.b bVar = p155m4.b.f44594a;
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
        p165n4.j jVarB = FetchedAppSettingsManager.b(Z3.q.b());
        if (jVarB != null) {
            if (!jVarB.f44897c.contains(SmartLoginOption.f25019c) || this.f25128A) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        dVar.setContentView(x(z10));
        return dVar;
    }

    public final void w(String str, b bVar, String str2, Date date, Date date2) {
        l lVar = this.f25133u;
        if (lVar != null) {
            lVar.d().d(new LoginClient.Result(lVar.d().f25061h, LoginClient.Result.Code.SUCCESS, new C0835a(str2, Z3.q.b(), str, bVar.f25139a, bVar.f25140b, bVar.f25141c, AccessTokenSource.f24733f, date, null, date2, "facebook"), null, null, null));
        }
        Dialog dialog = this.f17606m;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    public final View x(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.i.d(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(z10 ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        kotlin.jvm.internal.i.d(viewInflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        kotlin.jvm.internal.i.d(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.f25130r = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.confirmation_code);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f25131s = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cancel_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) viewFindViewById3).setOnClickListener(new com.facebook.login.d(this, 0));
        View viewFindViewById4 = viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f25132t = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public final void y() {
        if (this.f25134v.compareAndSet(false, true)) {
            c cVar = this.f25137y;
            if (cVar != null) {
                p155m4.b bVar = p155m4.b.f44594a;
                p155m4.b.a(cVar.f25143c);
            }
            l lVar = this.f25133u;
            if (lVar != null) {
                lVar.d().d(new LoginClient.Result(lVar.d().f25061h, LoginClient.Result.Code.CANCEL, null, null, "User canceled log in.", null));
            }
            Dialog dialog = this.f17606m;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public final void z(FacebookException facebookException) {
        if (this.f25134v.compareAndSet(false, true)) {
            c cVar = this.f25137y;
            if (cVar != null) {
                p155m4.b bVar = p155m4.b.f44594a;
                p155m4.b.a(cVar.f25143c);
            }
            l lVar = this.f25133u;
            if (lVar != null) {
                LoginClient.b bVar2 = lVar.d().f25061h;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                lVar.d().d(new LoginClient.Result(bVar2, LoginClient.Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.f17606m;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }
}
