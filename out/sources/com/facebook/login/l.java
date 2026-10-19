package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1347l;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f25149f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f25148e = new b();
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new l(source);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
    public static final class b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.i.e(parcel, "parcel");
        this.f25150d = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.x
    public final String e() {
        return this.f25150d;
    }

    @Override // com.facebook.login.x
    public final int l(LoginClient.b request) {
        kotlin.jvm.internal.i.e(request, "request");
        ActivityC1347l activityC1347lE = d().e();
        if (activityC1347lE == null || activityC1347lE.isFinishing()) {
            return 1;
        }
        k kVar = new k();
        kVar.v(activityC1347lE.getSupportFragmentManager(), "login_with_facebook");
        kVar.E(request);
        return 1;
    }

    public l(LoginClient loginClient) {
        this.f25188c = loginClient;
        this.f25150d = "device_auth";
    }
}
