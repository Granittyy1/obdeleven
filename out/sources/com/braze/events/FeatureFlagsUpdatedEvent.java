package com.braze.events;

import com.braze.models.FeatureFlag;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureFlagsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<FeatureFlag> featureFlags;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final FeatureFlagsUpdatedEvent getEmptyUpdate() {
            return new FeatureFlagsUpdatedEvent(EmptyList.f42983b);
        }

        private Companion() {
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }
    }

    public FeatureFlagsUpdatedEvent(List<FeatureFlag> featureFlags) {
        i.e(featureFlags, "featureFlags");
        this.featureFlags = featureFlags;
    }

    public static final FeatureFlagsUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final FeatureFlag getFeatureFlag(String id) {
        Object next;
        i.e(id, "id");
        Iterator<T> it = this.featureFlags.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (i.a(((FeatureFlag) next).getId(), id)) {
                return (FeatureFlag) next;
            }
        }
        next = null;
        return (FeatureFlag) next;
    }

    public final List<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public final int getFlagCount() {
        return this.featureFlags.size();
    }

    public final boolean isEmpty() {
        return this.featureFlags.isEmpty();
    }

    public String toString() {
        return "FeatureFlagsUpdatedEvent{flag count=" + this.featureFlags.size() + '}';
    }
}
