package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PersistedEvents.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PersistedEvents implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    /* JADX INFO: compiled from: PersistedEvents.kt */
    public static final class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents) {
            i.e(proxyEvents, "proxyEvents");
            this.proxyEvents = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.events);
    }

    public final void a(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> appEvents) {
        i.e(appEvents, "appEvents");
        if (!this.events.containsKey(accessTokenAppIdPair)) {
            this.events.put(accessTokenAppIdPair, q.p0(appEvents));
            return;
        }
        List<AppEvent> list = this.events.get(accessTokenAppIdPair);
        if (list == null) {
            return;
        }
        list.addAll(appEvents);
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> b() {
        Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> setEntrySet = this.events.entrySet();
        i.d(setEntrySet, "events.entries");
        return setEntrySet;
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> appEventMap) {
        i.e(appEventMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map = new HashMap<>();
        this.events = map;
        map.putAll(appEventMap);
    }
}
