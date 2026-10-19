package bo.app;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1481t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1481t f21920a = new C1481t();

    /* JADX INFO: renamed from: bo.app.t$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21921a;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardType.CONTROL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21921a = iArr;
        }
    }

    /* JADX INFO: renamed from: bo.app.t$b */
    public static final class b extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray) {
            super(1);
            this.f21922b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(Objects.nonNull(this.f21922b.opt(i10)));
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: bo.app.t$c */
    public static final class c extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21923b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONArray jSONArray) {
            super(1);
            this.f21923b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f21923b.get(i10);
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: bo.app.t$d */
    public static final class d extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardKey.Provider f21924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c2 f21925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ICardStorageProvider f21926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e2 f21927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONArray f21928f;

        /* JADX INFO: renamed from: bo.app.t$d$a */
        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f21929b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONArray f21930c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, JSONArray jSONArray) {
                super(0);
                this.f21929b = obj;
                this.f21930c = jSONArray;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Unable to create Card JSON in array. Ignoring. Was on element: " + this.f21929b + " of json array: " + this.f21930c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CardKey.Provider provider, c2 c2Var, ICardStorageProvider iCardStorageProvider, e2 e2Var, JSONArray jSONArray) {
            super(1);
            this.f21924b = provider;
            this.f21925c = c2Var;
            this.f21926d = iCardStorageProvider;
            this.f21927e = e2Var;
            this.f21928f = jSONArray;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Card invoke(Object it) {
            kotlin.jvm.internal.i.e(it, "it");
            try {
                return C1481t.f21920a.a(it.toString(), this.f21924b, this.f21925c, this.f21926d, this.f21927e);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(C1481t.f21920a, BrazeLogger.Priority.E, e10, new a(it, this.f21928f));
                return null;
            }
        }
    }

    private C1481t() {
    }

    public static final Card a(JSONObject jsonObject, CardKey.Provider cardKeyProvider, c2 brazeManager, ICardStorageProvider cardStorageProvider, e2 cardAnalyticsProvider) {
        Card imageOnlyCard;
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.i.e(cardKeyProvider, "cardKeyProvider");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(cardStorageProvider, "cardStorageProvider");
        kotlin.jvm.internal.i.e(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = cardKeyProvider.getCardTypeFromJson(jsonObject);
        int i10 = cardTypeFromJson == null ? -1 : a.f21921a[cardTypeFromJson.ordinal()];
        if (i10 == 1) {
            imageOnlyCard = new ImageOnlyCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i10 == 2) {
            imageOnlyCard = new CaptionedImageCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i10 == 3) {
            imageOnlyCard = new ShortNewsCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i10 == 4) {
            imageOnlyCard = new TextAnnouncementCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else {
            if (i10 != 5) {
                return null;
            }
            imageOnlyCard = new ControlCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        return imageOnlyCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Card a(String str, CardKey.Provider provider, c2 c2Var, ICardStorageProvider iCardStorageProvider, e2 e2Var) {
        return a(new JSONObject(str), provider, c2Var, iCardStorageProvider, e2Var);
    }

    public static final List a(JSONArray cardJsonStringArray, CardKey.Provider cardKeyProvider, c2 brazeManager, ICardStorageProvider cardStorageProvider, e2 cardAnalyticsProvider) {
        kotlin.jvm.internal.i.e(cardJsonStringArray, "cardJsonStringArray");
        kotlin.jvm.internal.i.e(cardKeyProvider, "cardKeyProvider");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(cardStorageProvider, "cardStorageProvider");
        kotlin.jvm.internal.i.e(cardAnalyticsProvider, "cardAnalyticsProvider");
        return SequencesKt___SequencesKt.F(SequencesKt___SequencesKt.D(new kotlin.sequences.n(SequencesKt__SequencesKt.x(new kotlin.sequences.n.a(new kotlin.sequences.n(SequencesKt___SequencesKt.C(kotlin.collections.q.H(Na.l.J(0, cardJsonStringArray.length())), new b(cardJsonStringArray)), new c(cardJsonStringArray)))), new d(cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray))));
    }
}
