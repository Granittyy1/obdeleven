package com.voltasit.obdeleven.domain.exceptions;

import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: ServiceNotFoundException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceNotFoundException extends Exception {
    public ServiceNotFoundException() {
        super(AttributeType.PHONE.concat(" service doesn't exist"));
    }
}
