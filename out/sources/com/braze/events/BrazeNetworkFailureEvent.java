package com.braze.events;

import bo.app.C1468g0;
import bo.app.C1487z;
import bo.app.d2;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeNetworkFailureEvent {
    private final d2 brazeRequest;
    private final Long requestInitiationTime;
    private final RequestType requestType;

    public enum RequestType {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    public BrazeNetworkFailureEvent(d2 brazeRequest) {
        i.e(brazeRequest, "brazeRequest");
        this.brazeRequest = brazeRequest;
        this.requestInitiationTime = brazeRequest.g();
        RequestType requestType = brazeRequest instanceof C1487z ? RequestType.CONTENT_CARDS_SYNC : ((brazeRequest instanceof C1468g0) && ((C1468g0) brazeRequest).m().y()) ? RequestType.NEWS_FEED_SYNC : RequestType.OTHER;
        this.requestType = requestType;
    }

    private final d2 component1() {
        return this.brazeRequest;
    }

    public static /* synthetic */ BrazeNetworkFailureEvent copy$default(BrazeNetworkFailureEvent brazeNetworkFailureEvent, d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = brazeNetworkFailureEvent.brazeRequest;
        }
        return brazeNetworkFailureEvent.copy(d2Var);
    }

    public final BrazeNetworkFailureEvent copy(d2 brazeRequest) {
        i.e(brazeRequest, "brazeRequest");
        return new BrazeNetworkFailureEvent(brazeRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrazeNetworkFailureEvent) && i.a(this.brazeRequest, ((BrazeNetworkFailureEvent) obj).brazeRequest);
    }

    public final Long getRequestInitiationTime() {
        return this.requestInitiationTime;
    }

    public final RequestType getRequestType() {
        return this.requestType;
    }

    public int hashCode() {
        return this.brazeRequest.hashCode();
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(brazeRequest=" + this.brazeRequest + ')';
    }
}
