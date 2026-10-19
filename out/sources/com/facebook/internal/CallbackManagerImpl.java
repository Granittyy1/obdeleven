package com.facebook.internal;

import Z3.q;
import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import p165n4.t;

/* JADX INFO: compiled from: CallbackManagerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackManagerImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f24970b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f24971c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24972a = new HashMap();

    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    public enum RequestCodeOffset {
        Login(0),
        /* JADX INFO: Fake field, exist only in values array */
        Share(1),
        /* JADX INFO: Fake field, exist only in values array */
        Message(2),
        /* JADX INFO: Fake field, exist only in values array */
        Like(3),
        /* JADX INFO: Fake field, exist only in values array */
        GameRequest(4),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupCreate(5),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupJoin(6),
        /* JADX INFO: Fake field, exist only in values array */
        AppInvite(7),
        /* JADX INFO: Fake field, exist only in values array */
        DeviceShare(8),
        /* JADX INFO: Fake field, exist only in values array */
        GamingFriendFinder(9),
        /* JADX INFO: Fake field, exist only in values array */
        GamingGroupIntegration(10),
        /* JADX INFO: Fake field, exist only in values array */
        Referral(11),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextCreate(12),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextSwitch(13),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextChoose(14),
        /* JADX INFO: Fake field, exist only in values array */
        TournamentShareDialog(15),
        /* JADX INFO: Fake field, exist only in values array */
        TournamentJoinDialog(16);

        private final int offset;

        RequestCodeOffset(int i10) {
            this.offset = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static RequestCodeOffset[] valuesCustom() {
            return (RequestCodeOffset[]) Arrays.copyOf(values(), 17);
        }

        public final int a() {
            q qVar = q.f7852a;
            t.e();
            return q.j + this.offset;
        }
    }

    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    public interface a {
        void a(int i10, Intent intent);
    }

    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    public static final class b {
    }

    public final boolean a(int i10, int i11, Intent intent) {
        a aVar;
        a aVar2 = (a) this.f24972a.get(Integer.valueOf(i10));
        if (aVar2 != null) {
            aVar2.a(i11, intent);
            return true;
        }
        synchronized (f24970b) {
            aVar = (a) f24971c.get(Integer.valueOf(i10));
        }
        if (aVar == null) {
            return false;
        }
        aVar.a(i11, intent);
        return true;
    }
}
