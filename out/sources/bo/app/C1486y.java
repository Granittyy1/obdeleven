package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.CardKey;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1486y implements ICardStorageProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f22198f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f22199g = kotlin.collections.B.C(CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2 f22201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f22202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f22203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e2 f22204e;

    /* JADX INFO: renamed from: bo.app.y$a */
    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22206c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.f22205b = str;
            this.f22206c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Detected SDK update from '");
            sb2.append(this.f22205b);
            sb2.append("' -> '");
            return Q8.d.a(sb2, this.f22206c, "'. Clearing config update time.");
        }
    }

    /* JADX INFO: renamed from: bo.app.y$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final boolean a(JSONObject jSONObject, JSONObject serverCard) {
            kotlin.jvm.internal.i.e(serverCard, "serverCard");
            if (jSONObject == null) {
                return false;
            }
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            return jSONObject.has(contentCardsKey) && serverCard.has(contentCardsKey) && jSONObject.getLong(contentCardsKey) > serverCard.getLong(contentCardsKey);
        }

        public final JSONObject b(JSONObject jSONObject, JSONObject serverCard) throws JSONException {
            kotlin.jvm.internal.i.e(serverCard, "serverCard");
            if (jSONObject == null) {
                return serverCard;
            }
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
            Iterator<String> itKeys2 = serverCard.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (C1486y.f22199g.contains(next2)) {
                    jSONObject2.put(next2, jSONObject.getBoolean(next2) || serverCard.getBoolean(next2));
                } else {
                    jSONObject2.put(next2, serverCard.get(next2));
                }
            }
            return jSONObject2;
        }

        private b() {
        }

        public final boolean a(JSONObject json, CardKey cardKey) {
            kotlin.jvm.internal.i.e(json, "json");
            kotlin.jvm.internal.i.e(cardKey, "cardKey");
            String contentCardsKey = cardKey.getContentCardsKey();
            if (json.has(contentCardsKey)) {
                return json.getBoolean(contentCardsKey);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f22207b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding card to test cache: " + this.f22207b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f22208b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deleting expired card from storage with id: " + this.f22208b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$e */
    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22209b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f22209b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Card not present in storage for id: " + this.f22209b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$f */
    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f22210b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to read card json from storage. Json: " + this.f22210b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$g */
    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f22211b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Removing card from test cache: " + this.f22211b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$h */
    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f22212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f22213c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Set set, Set set2) {
            super(0);
            this.f22212b = set;
            this.f22213c = set2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retaining card ids: " + this.f22212b + " among cached card ids: " + this.f22213c;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$i */
    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f22214b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Removing card from storage with id: " + this.f22214b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$j */
    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(JSONObject jSONObject) {
            super(0);
            this.f22215b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Server card json: " + this.f22215b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$k */
    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(JSONObject jSONObject) {
            super(0);
            this.f22216b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cached card json: " + this.f22216b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$l */
    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f22217b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The server card received is older than the cached card. Not updating the cached card.";
        }
    }

    /* JADX INFO: renamed from: bo.app.y$m */
    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.f22218b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Server card is marked as removed. Removing from card storage with id: " + this.f22218b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$n */
    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(JSONObject jSONObject) {
            super(0);
            this.f22219b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Server card was locally dismissed already. Not adding card to storage. Server card: " + this.f22219b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$o */
    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(JSONObject jSONObject) {
            super(0);
            this.f22220b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Server card has expired already. Not adding card to storage. Server card: " + this.f22220b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$p */
    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22221b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.f22221b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: " + this.f22221b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$q */
    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.f22222b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Can't update card field. Json cannot be parsed from disk or is not present. Id: " + this.f22222b;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$r */
    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f22223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CardKey f22224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Object obj, CardKey cardKey) {
            super(0);
            this.f22223b = obj;
            this.f22224c = cardKey;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to update card json field to " + this.f22223b + " with key: " + this.f22224c;
        }
    }

    /* JADX INFO: renamed from: bo.app.y$s */
    public static final class s extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f22225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(JSONArray jSONArray) {
            super(1);
            this.f22225b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(this.f22225b.opt(i10) instanceof JSONObject);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: bo.app.y$t */
    public static final class t extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f22226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(JSONArray jSONArray) {
            super(1);
            this.f22226b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f22226b.get(i10);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: bo.app.y$u */
    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f22227b = new u();

        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Input user id was null. Defaulting to the empty user id";
        }
    }

    /* JADX INFO: renamed from: bo.app.y$v */
    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1486y f22229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Ref$ObjectRef ref$ObjectRef, C1486y c1486y) {
            super(0);
            this.f22228b = ref$ObjectRef;
            this.f22229c = c1486y;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The received cards are for user " + ((String) this.f22228b.element) + " and the current user is " + this.f22229c.f22200a + " , the cards will be discarded and no changes will be made.";
        }
    }

    /* JADX INFO: renamed from: bo.app.y$w */
    public static final class w extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f22230b = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updating offline Content Cards for user with id: " + ((String) this.f22230b.element);
        }
    }

    public C1486y(Context context, String userId, String apiKey, c2 brazeManager, String currentSdkVersion) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(userId, "userId");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(currentSdkVersion, "currentSdkVersion");
        this.f22200a = userId;
        this.f22201b = brazeManager;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, userId, apiKey);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.content_cards_storage_provider.metadata" + cacheFileSuffix, 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.f22203d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.appboy.storage.content_cards_storage_provider.cards" + cacheFileSuffix, 0);
        kotlin.jvm.internal.i.d(sharedPreferences2, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.f22202c = sharedPreferences2;
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        if (!currentSdkVersion.equals(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(string, currentSdkVersion), 2, (Object) null);
            sharedPreferences.edit().putLong("last_full_sync_at", 0L).putString("last_accessed_sdk_version", currentSdkVersion).apply();
        }
        this.f22204e = new C1484w();
    }

    private final long g() {
        return this.f22203d.getLong("last_storage_update_timestamp", 0L);
    }

    private final void i() {
        this.f22203d.edit().putLong("last_storage_update_timestamp", DateTimeUtils.nowInSeconds()).apply();
    }

    @Override // com.braze.storage.ICardStorageProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContentCardsUpdatedEvent getCachedCardsAsEvent() {
        return a(true);
    }

    public final Set c() {
        Set<String> stringSet = this.f22203d.getStringSet(MetricTracker.Action.DISMISSED, new HashSet());
        return stringSet != null ? kotlin.collections.q.r0(kotlin.collections.q.M(stringSet)) : kotlin.collections.q.r0(EmptySet.f42985b);
    }

    public final Set d() {
        Set<String> stringSet = this.f22203d.getStringSet("expired", new HashSet());
        return stringSet != null ? kotlin.collections.q.r0(kotlin.collections.q.M(stringSet)) : kotlin.collections.q.r0(EmptySet.f42985b);
    }

    public final long e() {
        return this.f22203d.getLong("last_card_updated_at", 0L);
    }

    public final long f() {
        return this.f22203d.getLong("last_full_sync_at", 0L);
    }

    public final Set h() {
        Set<String> stringSet = this.f22203d.getStringSet("test", new HashSet());
        return kotlin.collections.q.r0(stringSet != null ? kotlin.collections.q.M(stringSet) : EmptySet.f42985b);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsClicked(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        a(cardId, CardKey.CLICKED, Boolean.TRUE);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsDismissed(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        a(cardId);
        a(cardId, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsViewed(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        a(cardId, CardKey.VIEWED, Boolean.TRUE);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsVisuallyRead(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        a(cardId, CardKey.READ, Boolean.TRUE);
    }

    private final void b(JSONObject jSONObject) throws JSONException {
        Set setC = c();
        Set setD = d();
        String serverCardId = jSONObject.getString(CardKey.ID.getContentCardsKey());
        kotlin.jvm.internal.i.d(serverCardId, "serverCardId");
        JSONObject jSONObjectD = d(serverCardId);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new j(jSONObject), 3, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new k(jSONObjectD), 3, (Object) null);
        b bVar = f22198f;
        if (bVar.a(jSONObjectD, jSONObject)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, l.f22217b, 2, (Object) null);
            return;
        }
        if (bVar.a(jSONObject, CardKey.REMOVED)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new m(serverCardId), 3, (Object) null);
            e(serverCardId);
            f(serverCardId);
            a(serverCardId, (JSONObject) null);
            return;
        }
        if (setC.contains(serverCardId)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new n(jSONObject), 3, (Object) null);
            return;
        }
        if (setD.contains(serverCardId)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new o(jSONObject), 3, (Object) null);
            return;
        }
        if (bVar.a(jSONObject, CardKey.DISMISSED)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new p(serverCardId), 3, (Object) null);
            a(serverCardId);
            a(serverCardId, (JSONObject) null);
        } else {
            a(serverCardId, bVar.b(jSONObjectD, jSONObject));
            if (bVar.a(jSONObject, CardKey.IS_TEST)) {
                c(serverCardId);
            }
        }
    }

    public final void e(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        Set<String> setC = c();
        setC.remove(cardId);
        this.f22203d.edit().putStringSet(MetricTracker.Action.DISMISSED, setC).apply();
    }

    public final void f(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(cardId), 2, (Object) null);
        Set<String> setH = h();
        setH.remove(cardId);
        this.f22203d.edit().putStringSet("test", setH).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(C1485x contentCardsResponse, String str) {
        kotlin.jvm.internal.i.e(contentCardsResponse, "contentCardsResponse");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = str;
        if (str == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, u.f22227b, 3, (Object) null);
            ref$ObjectRef.element = "";
        }
        if (!kotlin.jvm.internal.i.a(this.f22200a, ref$ObjectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new v(ref$ObjectRef, this), 2, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new w(ref$ObjectRef), 2, (Object) null);
        a(contentCardsResponse);
        i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray jSONArrayA = contentCardsResponse.a();
        if (jSONArrayA != null && jSONArrayA.length() != 0) {
            kotlin.sequences.e eVarC = SequencesKt___SequencesKt.C(kotlin.collections.q.H(Na.l.J(0, jSONArrayA.length())), new s(jSONArrayA));
            t tVar = new t(jSONArrayA);
            Iterator<T> it = eVarC.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) tVar.invoke(it.next());
                b(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                kotlin.jvm.internal.i.d(string, "serverCardJson.getString…rdKey.ID.contentCardsKey)");
                linkedHashSet.add(string);
            }
        }
        if (contentCardsResponse.d()) {
            b(linkedHashSet);
            c(linkedHashSet);
            linkedHashSet.addAll(h());
            a(linkedHashSet);
        }
        return a(false);
    }

    public final void c(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(cardId), 2, (Object) null);
        Set<String> setH = h();
        setH.add(cardId);
        this.f22203d.edit().putStringSet("test", setH).apply();
    }

    public final JSONObject d(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        String string = this.f22202c.getString(cardId, null);
        if (string == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(cardId), 3, (Object) null);
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new f(string));
            return null;
        }
    }

    public final void c(Set cardIdsToRetain) {
        kotlin.jvm.internal.i.e(cardIdsToRetain, "cardIdsToRetain");
        Set<String> setD = d();
        setD.retainAll(cardIdsToRetain);
        this.f22203d.edit().putStringSet("expired", setD).apply();
    }

    public /* synthetic */ C1486y(Context context, String str, String str2, c2 c2Var, String str3, int i10, kotlin.jvm.internal.e eVar) {
        this(context, str, str2, c2Var, (i10 & 16) != 0 ? Constants.BRAZE_SDK_VERSION : str3);
    }

    public final void b(Set cardIdsToRetain) {
        kotlin.jvm.internal.i.e(cardIdsToRetain, "cardIdsToRetain");
        Set<String> setC = c();
        setC.retainAll(cardIdsToRetain);
        this.f22203d.edit().putStringSet(MetricTracker.Action.DISMISSED, setC).apply();
    }

    public final Card a(JSONObject cardJson) {
        kotlin.jvm.internal.i.e(cardJson, "cardJson");
        return C1481t.a(cardJson, CardKey.Provider.CONTENT_CARDS, this.f22201b, this, this.f22204e);
    }

    public final ContentCardsUpdatedEvent a(boolean z10) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        Map<String, ?> all = this.f22202c.getAll();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List listA = C1481t.a(jSONArray, provider, this.f22201b, this, this.f22204e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        return new ContentCardsUpdatedEvent(list2, this.f22200a, g(), z10);
    }

    public final void b(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        Set<String> setD = d();
        setD.add(cardId);
        this.f22203d.edit().putStringSet("expired", setD).apply();
    }

    public final void a(Card card) {
        kotlin.jvm.internal.i.e(card, "card");
        String id = card.getId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(id), 3, (Object) null);
        a(id, (JSONObject) null);
        b(id);
        f(id);
    }

    public final void a(String cardId, CardKey cardKey, Object value) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        kotlin.jvm.internal.i.e(cardKey, "cardKey");
        kotlin.jvm.internal.i.e(value, "value");
        JSONObject jSONObjectD = d(cardId);
        if (jSONObjectD == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new q(cardId), 3, (Object) null);
            return;
        }
        try {
            jSONObjectD.put(cardKey.getContentCardsKey(), value);
            a(cardId, jSONObjectD);
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new r(value, cardKey));
        }
    }

    public final void a(C1485x contentCardsResponse) {
        kotlin.jvm.internal.i.e(contentCardsResponse, "contentCardsResponse");
        SharedPreferences.Editor editorEdit = this.f22203d.edit();
        if (contentCardsResponse.b() != -1) {
            editorEdit.putLong("last_card_updated_at", contentCardsResponse.b());
        }
        if (contentCardsResponse.c() != -1) {
            editorEdit.putLong("last_full_sync_at", contentCardsResponse.c());
        }
        editorEdit.apply();
    }

    public final void a(String cardId, JSONObject jSONObject) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        SharedPreferences.Editor editorEdit = this.f22202c.edit();
        if (jSONObject != null) {
            editorEdit.putString(cardId, jSONObject.toString());
        } else {
            editorEdit.remove(cardId);
        }
        editorEdit.apply();
    }

    public final void a(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        Set<String> setC = c();
        setC.add(cardId);
        this.f22203d.edit().putStringSet(MetricTracker.Action.DISMISSED, setC).apply();
    }

    public final void a(Set cardIdsToRetain) {
        kotlin.jvm.internal.i.e(cardIdsToRetain, "cardIdsToRetain");
        Set<String> setKeySet = this.f22202c.getAll().keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(cardIdsToRetain, setKeySet), 3, (Object) null);
        SharedPreferences.Editor editorEdit = this.f22202c.edit();
        for (String str : setKeySet) {
            if (!cardIdsToRetain.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(str), 3, (Object) null);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
    }
}
