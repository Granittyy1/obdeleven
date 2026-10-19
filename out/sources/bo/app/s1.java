package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.CardKey;
import com.braze.events.FeedUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements ICardStorageProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f21900f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f21901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f21902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f21903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f21904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e2 f21905e;

    public enum a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f21910c;

        a(String str, String str2) {
            this.f21909b = str;
            this.f21910c = str2;
        }

        public final String b() {
            return this.f21910c;
        }

        public final String c() {
            return this.f21909b;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final Set a(String input) {
            kotlin.jvm.internal.i.e(input, "input");
            HashSet hashSet = new HashSet();
            String[] strArr = (String[]) kotlin.text.n.e0(input, new String[]{";"}, 0, 6).toArray(new String[0]);
            Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
            return hashSet;
        }

        private b() {
        }

        public final Set a(JSONArray cardsArray) throws JSONException {
            kotlin.jvm.internal.i.e(cardsArray, "cardsArray");
            HashSet hashSet = new HashSet();
            int length = cardsArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = cardsArray.getJSONObject(i10);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    String string = jSONObject.getString(cardKey.getFeedKey());
                    kotlin.jvm.internal.i.d(string, "card.getString(CardKey.ID.feedKey)");
                    hashSet.add(string);
                }
            }
            return hashSet;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f21911b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updating offline feed for user with id: " + this.f21911b;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.f21912b = str;
            this.f21913c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("The received cards are for user ");
            sb2.append(this.f21912b);
            sb2.append(" and the current user is ");
            return Q8.d.a(sb2, this.f21913c, ", the cards will be discarded and no changes will be made.");
        }
    }

    public s1(Context context, String str, c2 brazeManager) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        this.f21901a = brazeManager;
        this.f21905e = new r1();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.feedstorageprovider" + StringUtils.getCacheFileSuffix(context, str == null ? "" : str), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…Id, Context.MODE_PRIVATE)");
        this.f21902b = sharedPreferences;
        this.f21903c = a(a.VIEWED_CARDS);
        this.f21904d = a(a.READ_CARDS);
        a(str);
    }

    @Override // com.braze.storage.ICardStorageProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FeedUpdatedEvent getCachedCardsAsEvent() {
        return a(new JSONArray(this.f21902b.getString("cards", "[]")), this.f21902b.getString("uid", ""), true, this.f21902b.getLong("cards_timestamp", -1L));
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsClicked(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsDismissed(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsViewed(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        if (this.f21903c.contains(cardId)) {
            return;
        }
        this.f21903c.add(cardId);
        a(this.f21903c, a.VIEWED_CARDS);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsVisuallyRead(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        if (this.f21904d.contains(cardId)) {
            return;
        }
        this.f21904d.add(cardId);
        a(this.f21904d, a.READ_CARDS);
    }

    public final FeedUpdatedEvent a(JSONArray cardsArray, String str) {
        kotlin.jvm.internal.i.e(cardsArray, "cardsArray");
        String str2 = str == null ? "" : str;
        String string = this.f21902b.getString("uid", "");
        if (kotlin.jvm.internal.i.a(string, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(str), 2, (Object) null);
            long jNowInSeconds = DateTimeUtils.nowInSeconds();
            a(cardsArray, jNowInSeconds);
            Set set = this.f21903c;
            b bVar = f21900f;
            set.retainAll(bVar.a(cardsArray));
            a(this.f21903c, a.VIEWED_CARDS);
            this.f21904d.retainAll(bVar.a(cardsArray));
            a(this.f21904d, a.READ_CARDS);
            return a(cardsArray, str, false, jNowInSeconds);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str, string), 3, (Object) null);
        return null;
    }

    private final FeedUpdatedEvent a(JSONArray jSONArray, String str, boolean z10, long j) {
        List listA;
        if (jSONArray.length() == 0) {
            listA = new ArrayList();
        } else {
            listA = C1481t.a(jSONArray, new CardKey.Provider(false), this.f21901a, this, this.f21905e);
        }
        List<Card> list = listA;
        for (Card card : list) {
            if (this.f21903c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f21904d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list, str, z10, j);
    }

    private final Set a(a aVar) {
        String strB = aVar.b();
        if (this.f21902b.contains(strB)) {
            String string = this.f21902b.getString(strB, null);
            Set setA = string != null ? f21900f.a(string) : null;
            SharedPreferences.Editor editorEdit = this.f21902b.edit();
            editorEdit.remove(strB);
            editorEdit.apply();
            if (setA != null) {
                a(setA, aVar);
                return setA;
            }
        }
        return new ConcurrentSkipListSet(this.f21902b.getStringSet(aVar.c(), new HashSet()));
    }

    private final void a(JSONArray jSONArray, long j) {
        SharedPreferences.Editor editorEdit = this.f21902b.edit();
        if (jSONArray.length() == 0) {
            editorEdit.remove("cards");
        } else {
            editorEdit.putString("cards", jSONArray.toString());
        }
        editorEdit.putLong("cards_timestamp", j);
        editorEdit.apply();
    }

    private final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f21902b.edit();
        editorEdit.putString("uid", str);
        editorEdit.apply();
    }

    public final void a(Set cardIds, a property) {
        kotlin.jvm.internal.i.e(cardIds, "cardIds");
        kotlin.jvm.internal.i.e(property, "property");
        String strC = property.c();
        SharedPreferences.Editor editorEdit = this.f21902b.edit();
        if (cardIds.isEmpty()) {
            editorEdit.remove(strC);
        } else {
            editorEdit.putStringSet(strC, cardIds);
        }
        editorEdit.apply();
    }
}
