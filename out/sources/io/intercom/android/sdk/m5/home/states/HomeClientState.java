package io.intercom.android.sdk.m5.home.states;

import Z3.o;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeClientState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeClientState {
    public static final int $stable = 8;
    private final NetworkResponse<HomeV2Response> homeResponse;
    private final boolean isHeaderImageLoaded;
    private final OpenMessengerResponse openMessengerResponseData;

    public HomeClientState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeClientState copy$default(HomeClientState homeClientState, NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkResponse = homeClientState.homeResponse;
        }
        if ((i10 & 2) != 0) {
            openMessengerResponse = homeClientState.openMessengerResponseData;
        }
        if ((i10 & 4) != 0) {
            z10 = homeClientState.isHeaderImageLoaded;
        }
        return homeClientState.copy(networkResponse, openMessengerResponse, z10);
    }

    public final NetworkResponse<HomeV2Response> component1() {
        return this.homeResponse;
    }

    public final OpenMessengerResponse component2() {
        return this.openMessengerResponseData;
    }

    public final boolean component3() {
        return this.isHeaderImageLoaded;
    }

    public final HomeClientState copy(NetworkResponse<HomeV2Response> networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10) {
        return new HomeClientState(networkResponse, openMessengerResponse, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeClientState)) {
            return false;
        }
        HomeClientState homeClientState = (HomeClientState) obj;
        return i.a(this.homeResponse, homeClientState.homeResponse) && i.a(this.openMessengerResponseData, homeClientState.openMessengerResponseData) && this.isHeaderImageLoaded == homeClientState.isHeaderImageLoaded;
    }

    public final NetworkResponse<HomeV2Response> getHomeResponse() {
        return this.homeResponse;
    }

    public final OpenMessengerResponse getOpenMessengerResponseData() {
        return this.openMessengerResponseData;
    }

    public int hashCode() {
        NetworkResponse<HomeV2Response> networkResponse = this.homeResponse;
        int iHashCode = (networkResponse == null ? 0 : networkResponse.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponseData;
        return Boolean.hashCode(this.isHeaderImageLoaded) + ((iHashCode + (openMessengerResponse != null ? openMessengerResponse.hashCode() : 0)) * 31);
    }

    public final boolean isHeaderImageLoaded() {
        return this.isHeaderImageLoaded;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HomeClientState(homeResponse=");
        sb2.append(this.homeResponse);
        sb2.append(", openMessengerResponseData=");
        sb2.append(this.openMessengerResponseData);
        sb2.append(", isHeaderImageLoaded=");
        return o.d(sb2, this.isHeaderImageLoaded, ')');
    }

    public HomeClientState(NetworkResponse<HomeV2Response> networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10) {
        this.homeResponse = networkResponse;
        this.openMessengerResponseData = openMessengerResponse;
        this.isHeaderImageLoaded = z10;
    }

    public /* synthetic */ HomeClientState(NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : networkResponse, (i10 & 2) != 0 ? null : openMessengerResponse, (i10 & 4) != 0 ? false : z10);
    }
}
