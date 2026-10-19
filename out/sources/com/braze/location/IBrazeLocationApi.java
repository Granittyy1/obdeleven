package com.braze.location;

import Ia.l;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import java.util.EnumSet;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeLocationApi {
    void initWithContext(Context context, EnumSet<LocationProviderName> enumSet, BrazeConfigurationProvider brazeConfigurationProvider);

    boolean requestSingleLocationUpdate(l<? super IBrazeLocation, r> lVar);
}
