package com.facebook.login;

import Z3.C0835a;
import Z3.C0842h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.animation.D;
import androidx.fragment.app.ActivityC1347l;
import com.facebook.CustomTabMainActivity;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x[] f25055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f25057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f25058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.a f25059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f25061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, String> f25062i;
    public LinkedHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f25063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25065m;

    /* JADX INFO: compiled from: LoginClient.kt */
    public static final class a implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        public final LoginClient createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            LoginClient loginClient = new LoginClient();
            loginClient.f25056c = -1;
            Parcelable[] parcelableArray = source.readParcelableArray(x.class.getClassLoader());
            if (parcelableArray == null) {
                parcelableArray = new Parcelable[0];
            }
            ArrayList arrayList = new ArrayList();
            int length = parcelableArray.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Parcelable parcelable = parcelableArray[i10];
                x xVar = parcelable instanceof x ? (x) parcelable : null;
                if (xVar != null) {
                    xVar.f25188c = loginClient;
                }
                if (xVar != null) {
                    arrayList.add(xVar);
                }
                i10++;
            }
            Object[] array = arrayList.toArray(new x[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            loginClient.f25055b = (x[]) array;
            loginClient.f25056c = source.readInt();
            loginClient.f25061h = (b) source.readParcelable(b.class.getClassLoader());
            HashMap mapD = p165n4.s.D(source);
            loginClient.f25062i = mapD == null ? null : kotlin.collections.y.y(mapD);
            HashMap mapD2 = p165n4.s.D(source);
            loginClient.j = mapD2 != null ? kotlin.collections.y.y(mapD2) : null;
            return loginClient;
        }

        @Override // android.os.Parcelable.Creator
        public final LoginClient[] newArray(int i10) {
            return new LoginClient[i10];
        }
    }

    public final void a(String str, String str2, boolean z10) {
        Map<String, String> map = this.f25062i;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f25062i == null) {
            this.f25062i = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f25060g) {
            return true;
        }
        ActivityC1347l activityC1347lE = e();
        if ((activityC1347lE == null ? -1 : activityC1347lE.checkCallingOrSelfPermission("android.permission.INTERNET")) == 0) {
            this.f25060g = true;
            return true;
        }
        ActivityC1347l activityC1347lE2 = e();
        String string = activityC1347lE2 == null ? null : activityC1347lE2.getString(R.string.com_facebook_internet_permission_error_title);
        String string2 = activityC1347lE2 != null ? activityC1347lE2.getString(R.string.com_facebook_internet_permission_error_message) : null;
        b bVar = this.f25061h;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        c(new Result(bVar, Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    public final void c(Result outcome) {
        kotlin.jvm.internal.i.e(outcome, "outcome");
        x xVarF = f();
        Result.Code code = outcome.f25066b;
        if (xVarF != null) {
            i(xVarF.e(), code.a(), outcome.f25069e, outcome.f25070f, xVarF.f25187b);
        }
        Map<String, String> map = this.f25062i;
        if (map != null) {
            outcome.f25072h = map;
        }
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap != null) {
            outcome.f25073i = linkedHashMap;
        }
        this.f25055b = null;
        this.f25056c = -1;
        this.f25061h = null;
        this.f25062i = null;
        this.f25064l = 0;
        this.f25065m = 0;
        r rVar = this.f25058e;
        if (rVar == null) {
            return;
        }
        s this$0 = (s) rVar.f25167b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.f25169c = null;
        int i10 = code == Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        ActivityC1347l activity = this$0.getActivity();
        if (!this$0.isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:8:0x001b, B:10:0x0025, B:14:0x0052, B:13:0x0038), top: B:22:0x001b }] */
    public final void d(Result outcome) {
        Result result;
        kotlin.jvm.internal.i.e(outcome, "outcome");
        C0835a c0835a = outcome.f25067c;
        if (c0835a != null) {
            Date date = C0835a.f7782m;
            if (C0835a.b.c()) {
                C0835a c0835aB = C0835a.b.b();
                Result.Code code = Result.Code.ERROR;
                if (c0835aB != null) {
                    try {
                        if (kotlin.jvm.internal.i.a(c0835aB.j, c0835a.j)) {
                            result = new Result(this.f25061h, Result.Code.SUCCESS, outcome.f25067c, outcome.f25068d, null, null);
                        } else {
                            b bVar = this.f25061h;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            result = new Result(bVar, code, null, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e10) {
                        b bVar2 = this.f25061h;
                        String message = e10.getMessage();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Caught exception");
                        if (message != null) {
                            arrayList2.add(message);
                        }
                        c(new Result(bVar2, code, null, null, TextUtils.join(": ", arrayList2), null));
                        return;
                    }
                } else {
                    b bVar3 = this.f25061h;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("User logged in as different Facebook user.");
                    result = new Result(bVar3, code, null, null, TextUtils.join(": ", arrayList3), null);
                }
                c(result);
                return;
            }
        }
        c(outcome);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ActivityC1347l e() {
        s sVar = this.f25057d;
        if (sVar == null) {
            return null;
        }
        return sVar.getActivity();
    }

    public final x f() {
        x[] xVarArr;
        int i10 = this.f25056c;
        if (i10 < 0 || (xVarArr = this.f25055b) == null) {
            return null;
        }
        return xVarArr[i10];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    public final t h() {
        Context contextE;
        b bVar;
        String strB;
        t tVar = this.f25063k;
        if (tVar == null) {
            contextE = e();
            if (contextE == null) {
                contextE = Z3.q.a();
            }
            bVar = this.f25061h;
            if (bVar == null) {
                strB = Z3.q.b();
            } else {
                strB = bVar.f25081e;
            }
            tVar = new t(contextE, strB);
            this.f25063k = tVar;
        } else {
            b bVar2 = this.f25061h;
            if (!kotlin.jvm.internal.i.a(tVar.f25175a, bVar2 == null ? null : bVar2.f25081e)) {
                contextE = e();
                if (contextE == null) {
                    contextE = Z3.q.a();
                }
                bVar = this.f25061h;
                if (bVar == null) {
                    strB = Z3.q.b();
                } else {
                    strB = bVar.f25081e;
                }
                tVar = new t(contextE, strB);
                this.f25063k = tVar;
            }
        }
        return tVar;
    }

    public final void i(String str, String str2, String str3, String str4, HashMap map) {
        b bVar = this.f25061h;
        if (bVar == null) {
            h().a("fb_mobile_login_method_complete", str);
            return;
        }
        t tVarH = h();
        String str5 = bVar.f25089n ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        ScheduledExecutorService scheduledExecutorService = t.f25174d;
        Bundle bundleA = t.a.a(bVar.f25082f);
        if (str2 != null) {
            bundleA.putString("2_result", str2);
        }
        if (str3 != null) {
            bundleA.putString("5_error_message", str3);
        }
        if (str4 != null) {
            bundleA.putString("4_error_code", str4);
        }
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getKey()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            bundleA.putString("6_extras", new JSONObject(linkedHashMap).toString());
        }
        bundleA.putString("3_method", str);
        tVarH.f25176b.a(bundleA, str5);
    }

    public final void j(int i10, int i11, Intent intent) {
        this.f25064l++;
        if (this.f25061h != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.j, false)) {
                k();
                return;
            }
            x xVarF = f();
            if (xVarF != null) {
                if ((xVarF instanceof q) && intent == null && this.f25064l < this.f25065m) {
                    return;
                }
                xVarF.i(i10, i11, intent);
            }
        }
    }

    public final void k() {
        x xVarF = f();
        if (xVarF != null) {
            i(xVarF.e(), "skipped", null, null, xVarF.f25187b);
        }
        x[] xVarArr = this.f25055b;
        while (xVarArr != null) {
            int i10 = this.f25056c;
            if (i10 >= xVarArr.length - 1) {
                break;
            }
            this.f25056c = i10 + 1;
            x xVarF2 = f();
            if (xVarF2 != null) {
                if (!(xVarF2 instanceof C) || b()) {
                    b bVar = this.f25061h;
                    if (bVar == null) {
                        continue;
                    } else {
                        int iL = xVarF2.l(bVar);
                        this.f25064l = 0;
                        String str = bVar.f25082f;
                        if (iL > 0) {
                            t tVarH = h();
                            String strE = xVarF2.e();
                            String str2 = bVar.f25089n ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            ScheduledExecutorService scheduledExecutorService = t.f25174d;
                            Bundle bundleA = t.a.a(str);
                            bundleA.putString("3_method", strE);
                            tVarH.f25176b.a(bundleA, str2);
                            this.f25065m = iL;
                        } else {
                            t tVarH2 = h();
                            String strE2 = xVarF2.e();
                            String str3 = bVar.f25089n ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            ScheduledExecutorService scheduledExecutorService2 = t.f25174d;
                            Bundle bundleA2 = t.a.a(str);
                            bundleA2.putString("3_method", strE2);
                            tVarH2.f25176b.a(bundleA2, str3);
                            a("not_tried", xVarF2.e(), true);
                        }
                        if (iL > 0) {
                            return;
                        }
                    }
                } else {
                    a("no_internet_permission", "1", false);
                }
            }
        }
        b bVar2 = this.f25061h;
        if (bVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            c(new Result(bVar2, Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeParcelableArray(this.f25055b, i10);
        dest.writeInt(this.f25056c);
        dest.writeParcelable(this.f25061h, i10);
        p165n4.s.I(dest, this.f25062i);
        p165n4.s.I(dest, this.j);
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Code f25066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0835a f25067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0842h f25068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f25069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f25070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f25071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map<String, String> f25072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public HashMap f25073i;

        /* JADX INFO: compiled from: LoginClient.kt */
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                return (Code[]) Arrays.copyOf(values(), 3);
            }

            public final String a() {
                return this.loggingValue;
            }
        }

        /* JADX INFO: compiled from: LoginClient.kt */
        public static final class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel source) {
                kotlin.jvm.internal.i.e(source, "source");
                return new Result(source);
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i10) {
                return new Result[i10];
            }
        }

        public Result(b bVar, Code code, C0835a c0835a, C0842h c0842h, String str, String str2) {
            this.f25071g = bVar;
            this.f25067c = c0835a;
            this.f25068d = c0842h;
            this.f25069e = str;
            this.f25066b = code;
            this.f25070f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeString(this.f25066b.name());
            dest.writeParcelable(this.f25067c, i10);
            dest.writeParcelable(this.f25068d, i10);
            dest.writeString(this.f25069e);
            dest.writeString(this.f25070f);
            dest.writeParcelable(this.f25071g, i10);
            p165n4.s.I(dest, this.f25072h);
            p165n4.s.I(dest, this.f25073i);
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.f25066b = Code.valueOf(string == null ? "error" : string);
            this.f25067c = (C0835a) parcel.readParcelable(C0835a.class.getClassLoader());
            this.f25068d = (C0842h) parcel.readParcelable(C0842h.class.getClassLoader());
            this.f25069e = parcel.readString();
            this.f25070f = parcel.readString();
            this.f25071g = (b) parcel.readParcelable(b.class.getClassLoader());
            this.f25072h = p165n4.s.D(parcel);
            this.f25073i = p165n4.s.D(parcel);
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoginBehavior f25078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<String> f25079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DefaultAudience f25080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f25081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f25082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f25083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f25084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f25085i;
        public final String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f25086k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f25087l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final LoginTargetApp f25088m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f25089n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f25090o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f25091p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f25092q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f25093r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final CodeChallengeMethod f25094s;

        /* JADX INFO: compiled from: LoginClient.kt */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel source) {
                kotlin.jvm.internal.i.e(source, "source");
                return new b(source);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Set set, String str, String str2, String str3, String str4, String str5, CodeChallengeMethod codeChallengeMethod) {
            LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;
            LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
            DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
            this.f25078b = loginBehavior;
            this.f25079c = set == null ? new HashSet() : set;
            this.f25080d = defaultAudience;
            this.f25085i = "rerequest";
            this.f25081e = str;
            this.f25082f = str2;
            this.f25088m = loginTargetApp;
            if (str3 == null || str3.length() == 0) {
                this.f25091p = D.c("randomUUID().toString()");
            } else {
                this.f25091p = str3;
            }
            this.f25092q = str4;
            this.f25093r = str5;
            this.f25094s = codeChallengeMethod;
        }

        public final boolean a() {
            return this.f25088m == LoginTargetApp.INSTAGRAM;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeString(this.f25078b.name());
            dest.writeStringList(new ArrayList(this.f25079c));
            dest.writeString(this.f25080d.name());
            dest.writeString(this.f25081e);
            dest.writeString(this.f25082f);
            dest.writeByte(this.f25083g ? (byte) 1 : (byte) 0);
            dest.writeString(this.f25084h);
            dest.writeString(this.f25085i);
            dest.writeString(this.j);
            dest.writeString(this.f25086k);
            dest.writeByte(this.f25087l ? (byte) 1 : (byte) 0);
            dest.writeString(this.f25088m.name());
            dest.writeByte(this.f25089n ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f25090o ? (byte) 1 : (byte) 0);
            dest.writeString(this.f25091p);
            dest.writeString(this.f25092q);
            dest.writeString(this.f25093r);
            CodeChallengeMethod codeChallengeMethod = this.f25094s;
            dest.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }

        public b(Parcel parcel) {
            DefaultAudience defaultAudienceValueOf;
            LoginTargetApp loginTargetAppValueOf;
            int i10 = p165n4.t.f44935a;
            String string = parcel.readString();
            p165n4.t.d(string, "loginBehavior");
            this.f25078b = LoginBehavior.valueOf(string);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f25079c = new HashSet(arrayList);
            String string2 = parcel.readString();
            if (string2 != null) {
                defaultAudienceValueOf = DefaultAudience.valueOf(string2);
            } else {
                defaultAudienceValueOf = DefaultAudience.NONE;
            }
            this.f25080d = defaultAudienceValueOf;
            String string3 = parcel.readString();
            p165n4.t.d(string3, "applicationId");
            this.f25081e = string3;
            String string4 = parcel.readString();
            p165n4.t.d(string4, "authId");
            this.f25082f = string4;
            this.f25083g = parcel.readByte() != 0;
            this.f25084h = parcel.readString();
            String string5 = parcel.readString();
            p165n4.t.d(string5, "authType");
            this.f25085i = string5;
            this.j = parcel.readString();
            this.f25086k = parcel.readString();
            this.f25087l = parcel.readByte() != 0;
            String string6 = parcel.readString();
            if (string6 != null) {
                loginTargetAppValueOf = LoginTargetApp.valueOf(string6);
            } else {
                loginTargetAppValueOf = LoginTargetApp.FACEBOOK;
            }
            this.f25088m = loginTargetAppValueOf;
            this.f25089n = parcel.readByte() != 0;
            this.f25090o = parcel.readByte() != 0;
            String string7 = parcel.readString();
            p165n4.t.d(string7, "nonce");
            this.f25091p = string7;
            this.f25092q = parcel.readString();
            this.f25093r = parcel.readString();
            String string8 = parcel.readString();
            this.f25094s = string8 == null ? null : CodeChallengeMethod.valueOf(string8);
        }
    }
}
