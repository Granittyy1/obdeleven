package com.parse;

import androidx.compose.foundation.gestures.d;
import com.braze.Constants;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class OfflineQueryLogic {
    private final OfflineStore store;

    public abstract class ConstraintMatcher<T extends ParseObject> {
        final ParseUser user;

        public ConstraintMatcher(ParseUser parseUser) {
            this.user = parseUser;
        }

        public abstract Task<Boolean> matchesAsync(T t8, ParseSQLiteDatabase parseSQLiteDatabase);
    }

    public interface Decider {
        boolean decide(Object obj, Object obj2);
    }

    public abstract class SubQueryMatcher<T extends ParseObject> extends ConstraintMatcher<T> {
        private final ParseQuery.State<T> subQuery;
        private Task<List<T>> subQueryResults;

        public SubQueryMatcher(ParseUser parseUser, ParseQuery.State<T> state) {
            super(parseUser);
            this.subQueryResults = null;
            this.subQuery = state;
        }

        public abstract boolean matches(T t8, List<T> list) throws ParseException;

        @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
        public Task<Boolean> matchesAsync(final T t8, ParseSQLiteDatabase parseSQLiteDatabase) {
            if (this.subQueryResults == null) {
                this.subQueryResults = OfflineQueryLogic.this.store.findAsync(this.subQuery, this.user, null, parseSQLiteDatabase);
            }
            return this.subQueryResults.onSuccess(new Continuation<List<T>, Boolean>() { // from class: com.parse.OfflineQueryLogic.SubQueryMatcher.1
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.parse.boltsinternal.Continuation
                public Boolean then(Task<List<T>> task) throws ParseException {
                    return Boolean.valueOf(SubQueryMatcher.this.matches(t8, task.getResult()));
                }
            });
        }
    }

    public OfflineQueryLogic(OfflineStore offlineStore) {
        this.store = offlineStore;
    }

    private static Collection<?> cleanRegexStartsWith(Collection<?> collection) {
        ParseQuery.KeyConstraints keyConstraintsCleanRegexStartsWith;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!(obj instanceof ParseQuery.KeyConstraints) || (keyConstraintsCleanRegexStartsWith = cleanRegexStartsWith((ParseQuery.KeyConstraints) obj)) == null) {
                return null;
            }
            arrayList.add(keyConstraintsCleanRegexStartsWith);
        }
        return arrayList;
    }

    private static boolean compare(Object obj, Object obj2, Decider decider) {
        if (obj2 instanceof List) {
            return compareList(obj, (List) obj2, decider);
        }
        return obj2 instanceof JSONArray ? compareArray(obj, (JSONArray) obj2, decider) : decider.decide(obj, obj2);
    }

    private static boolean compareArray(Object obj, JSONArray jSONArray, Decider decider) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (decider.decide(obj, jSONArray.get(i10))) {
                    return true;
                }
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
        return false;
    }

    private static boolean compareList(Object obj, List<?> list, Decider decider) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            if (decider.decide(obj, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareTo(Object obj, Object obj2) {
        Object obj3 = JSONObject.NULL;
        boolean z10 = obj == obj3 || obj == null;
        boolean z11 = obj2 == obj3 || obj2 == null;
        if (z10 || z11) {
            if (z10) {
                return !z11 ? -1 : 0;
            }
            return 1;
        }
        if ((obj instanceof Date) && (obj2 instanceof Date)) {
            return ((Date) obj).compareTo((Date) obj2);
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return ((String) obj).compareTo((String) obj2);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return Numbers.compare((Number) obj, (Number) obj2);
        }
        throw new IllegalArgumentException(String.format("Cannot compare %s against %s", obj, obj2));
    }

    private <T extends ParseObject> ConstraintMatcher<T> createDontSelectMatcher(ParseUser parseUser, Object obj, String str) {
        final ConstraintMatcher<T> constraintMatcherCreateSelectMatcher = createSelectMatcher(parseUser, obj, str);
        return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.16
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
            @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
            public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                return constraintMatcherCreateSelectMatcher.matchesAsync(parseObject, parseSQLiteDatabase).onSuccess(new Continuation<Boolean, Boolean>() { // from class: com.parse.OfflineQueryLogic.16.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Boolean then(Task<Boolean> task) {
                        return Boolean.valueOf(!task.getResult().booleanValue());
                    }
                });
            }
        };
    }

    private <T extends ParseObject> ConstraintMatcher<T> createInQueryMatcher(ParseUser parseUser, Object obj, final String str) {
        return new SubQueryMatcher<T>(parseUser, ((ParseQuery.State.Builder) obj).build()) { // from class: com.parse.OfflineQueryLogic.13
            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/util/List<TT;>;)Z */
            @Override // com.parse.OfflineQueryLogic.SubQueryMatcher
            public boolean matches(ParseObject parseObject, List list) throws ParseException {
                return OfflineQueryLogic.matchesInConstraint(list, OfflineQueryLogic.getValue(parseObject, str));
            }
        };
    }

    private <T extends ParseObject> ConstraintMatcher<T> createMatcher(ParseUser parseUser, final String str, final Object obj, final String str2, final ParseQuery.KeyConstraints keyConstraints) {
        str.getClass();
        switch (str) {
            case "$dontSelect":
                return createDontSelectMatcher(parseUser, obj, str2);
            case "$inQuery":
                return createInQueryMatcher(parseUser, obj, str2);
            case "$notInQuery":
                return createNotInQueryMatcher(parseUser, obj, str2);
            case "$select":
                return createSelectMatcher(parseUser, obj, str2);
            default:
                return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.17
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
                    @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
                    public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                        try {
                            return Task.forResult(Boolean.valueOf(OfflineQueryLogic.matchesStatelessConstraint(str, obj, OfflineQueryLogic.getValue(parseObject, str2), keyConstraints)));
                        } catch (ParseException e10) {
                            return Task.forError(e10);
                        }
                    }
                };
        }
    }

    private <T extends ParseObject> ConstraintMatcher<T> createNotInQueryMatcher(ParseUser parseUser, Object obj, String str) {
        final ConstraintMatcher<T> constraintMatcherCreateInQueryMatcher = createInQueryMatcher(parseUser, obj, str);
        return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.14
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
            @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
            public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                return constraintMatcherCreateInQueryMatcher.matchesAsync(parseObject, parseSQLiteDatabase).onSuccess(new Continuation<Boolean, Boolean>() { // from class: com.parse.OfflineQueryLogic.14.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Boolean then(Task<Boolean> task) {
                        return Boolean.valueOf(!task.getResult().booleanValue());
                    }
                });
            }
        };
    }

    private <T extends ParseObject> ConstraintMatcher<T> createOrMatcher(ParseUser parseUser, ArrayList<ParseQuery.QueryConstraints> arrayList) {
        final ArrayList arrayList2 = new ArrayList();
        Iterator<ParseQuery.QueryConstraints> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(createMatcher(parseUser, it.next()));
        }
        return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.18
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
            @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
            public Task matchesAsync(final ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
                Task taskForResult = Task.forResult(Boolean.FALSE);
                for (final ConstraintMatcher constraintMatcher : arrayList2) {
                    taskForResult = taskForResult.onSuccessTask(new Continuation<Boolean, Task<Boolean>>() { // from class: com.parse.OfflineQueryLogic.18.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Boolean> then(Task<Boolean> task) {
                            return task.getResult().booleanValue() ? task : constraintMatcher.matchesAsync(parseObject, parseSQLiteDatabase);
                        }
                    });
                }
                return taskForResult;
            }
        };
    }

    private <T extends ParseObject> ConstraintMatcher<T> createSelectMatcher(ParseUser parseUser, Object obj, final String str) {
        Map map = (Map) obj;
        ParseQuery.State<T> stateBuild = ((ParseQuery.State.Builder) map.get("query")).build();
        final String str2 = (String) map.get("key");
        return new SubQueryMatcher<T>(parseUser, stateBuild) { // from class: com.parse.OfflineQueryLogic.15
            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/util/List<TT;>;)Z */
            @Override // com.parse.OfflineQueryLogic.SubQueryMatcher
            public boolean matches(ParseObject parseObject, List list) throws ParseException {
                Object value = OfflineQueryLogic.getValue(parseObject, str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (OfflineQueryLogic.matchesEqualConstraint(value, OfflineQueryLogic.getValue((ParseObject) it.next(), str2))) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task<Void> fetchIncludeAsync(final OfflineStore offlineStore, final Object obj, final String str, final ParseSQLiteDatabase parseSQLiteDatabase) {
        if (obj == null) {
            return Task.forResult(null);
        }
        if (obj instanceof Collection) {
            Task<Void> taskForResult = Task.forResult(null);
            for (final Object obj2 : (Collection) obj) {
                taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineQueryLogic.8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task) {
                        return OfflineQueryLogic.fetchIncludeAsync(offlineStore, obj2, str, parseSQLiteDatabase);
                    }
                });
            }
            return taskForResult;
        }
        if (obj instanceof JSONArray) {
            final JSONArray jSONArray = (JSONArray) obj;
            Task<Void> taskForResult2 = Task.forResult(null);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                final int i11 = i10;
                taskForResult2 = taskForResult2.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineQueryLogic.9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task) throws Exception {
                        return OfflineQueryLogic.fetchIncludeAsync(offlineStore, jSONArray.get(i11), str, parseSQLiteDatabase);
                    }
                });
            }
            return taskForResult2;
        }
        if (str == null) {
            if (JSONObject.NULL.equals(obj)) {
                return Task.forResult(null);
            }
            return obj instanceof ParseObject ? offlineStore.fetchLocallyAsync((ParseObject) obj, parseSQLiteDatabase).makeVoid() : Task.forError(new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMinor, "include is invalid for non-ParseObjects"));
        }
        String[] strArrSplit = str.split("\\.", 2);
        final String str2 = strArrSplit[0];
        final String str3 = strArrSplit.length > 1 ? strArrSplit[1] : null;
        return Task.forResult(null).continueWithTask(new Continuation<Void, Task<Object>>() { // from class: com.parse.OfflineQueryLogic.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Object> then(Task<Void> task) {
                Object obj3 = obj;
                if (obj3 instanceof ParseObject) {
                    return OfflineQueryLogic.fetchIncludeAsync(offlineStore, obj3, null, parseSQLiteDatabase).onSuccess(new Continuation<Void, Object>() { // from class: com.parse.OfflineQueryLogic.11.1
                        @Override // com.parse.boltsinternal.Continuation
                        public Object then(Task<Void> task2) {
                            AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                            return ((ParseObject) obj).get(str2);
                        }
                    });
                }
                if (obj3 instanceof Map) {
                    return Task.forResult(((Map) obj3).get(str2));
                }
                if (obj3 instanceof JSONObject) {
                    return Task.forResult(((JSONObject) obj3).opt(str2));
                }
                if (JSONObject.NULL.equals(obj3)) {
                    return null;
                }
                return Task.forError(new IllegalStateException("include is invalid"));
            }
        }).onSuccessTask(new Continuation<Object, Task<Void>>() { // from class: com.parse.OfflineQueryLogic.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Object> task) {
                return OfflineQueryLogic.fetchIncludeAsync(offlineStore, task.getResult(), str3, parseSQLiteDatabase);
            }
        });
    }

    public static <T extends ParseObject> Task<Void> fetchIncludesAsync(final OfflineStore offlineStore, final T t8, ParseQuery.State<T> state, final ParseSQLiteDatabase parseSQLiteDatabase) {
        Set<String> setIncludes = state.includes();
        Task<Void> taskForResult = Task.forResult(null);
        for (final String str : setIncludes) {
            taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineQueryLogic.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return OfflineQueryLogic.fetchIncludeAsync(offlineStore, t8, str, parseSQLiteDatabase);
                }
            });
        }
        return taskForResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getValue(Object obj, String str) throws ParseException {
        return getValue(obj, str, 0);
    }

    public static <T extends ParseObject> boolean hasReadAccess(ParseUser parseUser, T t8) {
        ParseACL acl;
        if (parseUser == t8 || (acl = t8.getACL()) == null || acl.getPublicReadAccess()) {
            return true;
        }
        return parseUser != null && acl.getReadAccess(parseUser);
    }

    private static boolean isAnyValueRegexStartsWith(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (isStartsWithRegex(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStartsWithRegex(Object obj) {
        if (obj == null || !(obj instanceof ParseQuery.KeyConstraints)) {
            return false;
        }
        ParseQuery.KeyConstraints keyConstraints = (ParseQuery.KeyConstraints) obj;
        return keyConstraints.size() == 1 && keyConstraints.containsKey("$regex") && ((String) keyConstraints.get("$regex")).startsWith("^");
    }

    private static boolean matchesAllConstraint(Object obj, Object obj2) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        if (!(obj2 instanceof Collection)) {
            throw new IllegalArgumentException("Value type not supported for $all queries.");
        }
        if (!(obj instanceof Collection)) {
            throw new IllegalArgumentException("Constraint type not supported for $all queries.");
        }
        Collection collection = (Collection) obj;
        if (isAnyValueRegexStartsWith(collection) && (obj = cleanRegexStartsWith((Collection<?>) collection)) == null) {
            throw new IllegalArgumentException("All values in $all queries must be of starting with regex or non regex.");
        }
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            if (!matchesEqualConstraint(it.next(), obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean matchesEqualConstraint(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == obj2;
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return compareTo(obj, obj2) == 0;
        }
        if ((obj instanceof ParseGeoPoint) && (obj2 instanceof ParseGeoPoint)) {
            ParseGeoPoint parseGeoPoint = (ParseGeoPoint) obj;
            ParseGeoPoint parseGeoPoint2 = (ParseGeoPoint) obj2;
            return parseGeoPoint.getLatitude() == parseGeoPoint2.getLatitude() && parseGeoPoint.getLongitude() == parseGeoPoint2.getLongitude();
        }
        if ((obj instanceof ParsePolygon) && (obj2 instanceof ParsePolygon)) {
            return ((ParsePolygon) obj).equals((ParsePolygon) obj2);
        }
        return compare(obj, obj2, isStartsWithRegex(obj) ? new Decider() { // from class: com.parse.OfflineQueryLogic.1
            @Override // com.parse.OfflineQueryLogic.Decider
            public boolean decide(Object obj3, Object obj4) {
                return ((String) obj4).matches(((ParseQuery.KeyConstraints) obj3).get("$regex").toString());
            }
        } : new Decider() { // from class: com.parse.OfflineQueryLogic.2
            @Override // com.parse.OfflineQueryLogic.Decider
            public boolean decide(Object obj3, Object obj4) {
                return obj3.equals(obj4);
            }
        });
    }

    private static boolean matchesExistsConstraint(Object obj, Object obj2) {
        if (obj == null || !((Boolean) obj).booleanValue()) {
            return obj2 == null || obj2 == JSONObject.NULL;
        }
        return (obj2 == null || obj2 == JSONObject.NULL) ? false : true;
    }

    private static boolean matchesGeoIntersectsConstraint(Object obj, Object obj2) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        return ((ParsePolygon) obj2).containsPoint((ParseGeoPoint) ((HashMap) obj).get("$point"));
    }

    private static boolean matchesGeoWithinConstraint(Object obj, Object obj2) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        return new ParsePolygon((List) ((HashMap) obj).get("$polygon")).containsPoint((ParseGeoPoint) obj2);
    }

    private static boolean matchesGreaterThanConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new Decider() { // from class: com.parse.OfflineQueryLogic.5
            @Override // com.parse.OfflineQueryLogic.Decider
            public boolean decide(Object obj3, Object obj4) {
                return (obj4 == null || obj4 == JSONObject.NULL || OfflineQueryLogic.compareTo(obj3, obj4) >= 0) ? false : true;
            }
        });
    }

    private static boolean matchesGreaterThanOrEqualToConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new Decider() { // from class: com.parse.OfflineQueryLogic.6
            @Override // com.parse.OfflineQueryLogic.Decider
            public boolean decide(Object obj3, Object obj4) {
                return (obj4 == null || obj4 == JSONObject.NULL || OfflineQueryLogic.compareTo(obj3, obj4) > 0) ? false : true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean matchesInConstraint(Object obj, Object obj2) {
        if (!(obj instanceof Collection)) {
            throw new IllegalArgumentException("Constraint type not supported for $in queries.");
        }
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            if (matchesEqualConstraint(it.next(), obj2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean matchesLessThanConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new Decider() { // from class: com.parse.OfflineQueryLogic.3
            @Override // com.parse.OfflineQueryLogic.Decider
            public boolean decide(Object obj3, Object obj4) {
                return (obj4 == null || obj4 == JSONObject.NULL || OfflineQueryLogic.compareTo(obj3, obj4) <= 0) ? false : true;
            }
        });
    }

    private static boolean matchesLessThanOrEqualToConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new Decider() { // from class: com.parse.OfflineQueryLogic.4
            @Override // com.parse.OfflineQueryLogic.Decider
            public boolean decide(Object obj3, Object obj4) {
                return (obj4 == null || obj4 == JSONObject.NULL || OfflineQueryLogic.compareTo(obj3, obj4) < 0) ? false : true;
            }
        });
    }

    private static boolean matchesNearSphereConstraint(Object obj, Object obj2, Double d10) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        return d10 == null || ((ParseGeoPoint) obj).distanceInRadiansTo((ParseGeoPoint) obj2) <= d10.doubleValue();
    }

    private static boolean matchesNotEqualConstraint(Object obj, Object obj2) {
        return !matchesEqualConstraint(obj, obj2);
    }

    private static boolean matchesNotInConstraint(Object obj, Object obj2) {
        return !matchesInConstraint(obj, obj2);
    }

    private static boolean matchesRegexConstraint(Object obj, Object obj2, String str) throws ParseException {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        if (!str.matches("^[imxs]*$")) {
            throw new ParseException(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "Invalid regex options: ".concat(str));
        }
        int i10 = str.contains("i") ? 2 : 0;
        if (str.contains("m")) {
            i10 |= 8;
        }
        if (str.contains("x")) {
            i10 |= 4;
        }
        if (str.contains(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY)) {
            i10 |= 32;
        }
        return Pattern.compile((String) obj, i10).matcher((String) obj2).find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean matchesStatelessConstraint(String str, Object obj, Object obj2, ParseQuery.KeyConstraints keyConstraints) throws ParseException {
        str.getClass();
        switch (str) {
            case "$geoWithin":
                return matchesGeoWithinConstraint(obj, obj2);
            case "$maxDistance":
                return true;
            case "$nearSphere":
                return matchesNearSphereConstraint(obj, obj2, (Double) keyConstraints.get("$maxDistance"));
            case "$gt":
                return matchesGreaterThanConstraint(obj, obj2);
            case "$in":
                return matchesInConstraint(obj, obj2);
            case "$lt":
                return matchesLessThanConstraint(obj, obj2);
            case "$ne":
                return matchesNotEqualConstraint(obj, obj2);
            case "$all":
                return matchesAllConstraint(obj, obj2);
            case "$gte":
                return matchesGreaterThanOrEqualToConstraint(obj, obj2);
            case "$lte":
                return matchesLessThanOrEqualToConstraint(obj, obj2);
            case "$nin":
                return matchesNotInConstraint(obj, obj2);
            case "$exists":
                return matchesExistsConstraint(obj, obj2);
            case "$within":
                return matchesWithinConstraint(obj, obj2);
            case "$regex":
                return matchesRegexConstraint(obj, obj2, (String) keyConstraints.get("$options"));
            case "$options":
                return true;
            case "$geoIntersects":
                return matchesGeoIntersectsConstraint(obj, obj2);
            default:
                throw new UnsupportedOperationException(d.b("The offline store does not yet support the ", str, " operator."));
        }
    }

    private static boolean matchesWithinConstraint(Object obj, Object obj2) throws ParseException {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        ArrayList arrayList = (ArrayList) ((HashMap) obj).get("$box");
        ParseGeoPoint parseGeoPoint = (ParseGeoPoint) arrayList.get(0);
        ParseGeoPoint parseGeoPoint2 = (ParseGeoPoint) arrayList.get(1);
        ParseGeoPoint parseGeoPoint3 = (ParseGeoPoint) obj2;
        if (parseGeoPoint2.getLongitude() < parseGeoPoint.getLongitude()) {
            throw new ParseException(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "whereWithinGeoBox queries cannot cross the International Date Line.");
        }
        if (parseGeoPoint2.getLatitude() < parseGeoPoint.getLatitude()) {
            throw new ParseException(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "The southwest corner of a geo box must be south of the northeast corner.");
        }
        if (parseGeoPoint2.getLongitude() - parseGeoPoint.getLongitude() <= 180.0d) {
            return parseGeoPoint3.getLatitude() >= parseGeoPoint.getLatitude() && parseGeoPoint3.getLatitude() <= parseGeoPoint2.getLatitude() && parseGeoPoint3.getLongitude() >= parseGeoPoint.getLongitude() && parseGeoPoint3.getLongitude() <= parseGeoPoint2.getLongitude();
        }
        throw new ParseException(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "Geo box queries larger than 180 degrees in longitude are not supported. Please check point order.");
    }

    public static <T extends ParseObject> void sort(List<T> list, ParseQuery.State<T> state) throws ParseException {
        final List<String> listOrder = state.order();
        for (String str : state.order()) {
            if (!str.matches("^-?[A-Za-z][A-Za-z0-9_]*$") && !"_created_at".equals(str) && !"_updated_at".equals(str)) {
                throw new ParseException(105, d.b("Invalid key name: \"", str, "\"."));
            }
        }
        final String str2 = null;
        final ParseGeoPoint parseGeoPoint = null;
        for (String str3 : state.constraints().keySet()) {
            Object obj = state.constraints().get(str3);
            if (obj instanceof ParseQuery.KeyConstraints) {
                ParseQuery.KeyConstraints keyConstraints = (ParseQuery.KeyConstraints) obj;
                if (keyConstraints.containsKey("$nearSphere")) {
                    parseGeoPoint = (ParseGeoPoint) keyConstraints.get("$nearSphere");
                    str2 = str3;
                }
            }
        }
        if (listOrder.size() == 0 && str2 == null) {
            return;
        }
        Collections.sort(list, new Comparator<T>() { // from class: com.parse.OfflineQueryLogic.7
            /* JADX WARN: Incorrect types in method signature: (TT;TT;)I */
            @Override // java.util.Comparator
            public int compare(ParseObject parseObject, ParseObject parseObject2) {
                boolean z10;
                int iCompareTo;
                String str4 = str2;
                if (str4 != null) {
                    try {
                        ParseGeoPoint parseGeoPoint2 = (ParseGeoPoint) OfflineQueryLogic.getValue(parseObject, str4);
                        ParseGeoPoint parseGeoPoint3 = (ParseGeoPoint) OfflineQueryLogic.getValue(parseObject2, str2);
                        double dDistanceInRadiansTo = parseGeoPoint2.distanceInRadiansTo(parseGeoPoint);
                        double dDistanceInRadiansTo2 = parseGeoPoint3.distanceInRadiansTo(parseGeoPoint);
                        if (dDistanceInRadiansTo != dDistanceInRadiansTo2) {
                            return dDistanceInRadiansTo - dDistanceInRadiansTo2 > 0.0d ? 1 : -1;
                        }
                    } catch (ParseException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                Iterator it = listOrder.iterator();
                do {
                    z10 = false;
                    if (!it.hasNext()) {
                        return 0;
                    }
                    String strSubstring = (String) it.next();
                    if (strSubstring.startsWith("-")) {
                        strSubstring = strSubstring.substring(1);
                        z10 = true;
                    }
                    try {
                        try {
                            iCompareTo = OfflineQueryLogic.compareTo(OfflineQueryLogic.getValue(parseObject, strSubstring), OfflineQueryLogic.getValue(parseObject2, strSubstring));
                        } catch (IllegalArgumentException e11) {
                            throw new IllegalArgumentException(d.b("Unable to sort by key ", strSubstring, "."), e11);
                        }
                    } catch (ParseException e12) {
                        throw new RuntimeException(e12);
                    }
                } while (iCompareTo == 0);
                return z10 ? -iCompareTo : iCompareTo;
            }
        });
    }

    private static Object getValue(Object obj, String str, int i10) throws ParseException {
        byte b10 = 0;
        Object objEncode = null;
        if (str.contains(".")) {
            String[] strArrSplit = str.split("\\.", 2);
            int i11 = i10 + 1;
            Object value = getValue(obj, strArrSplit[0], i11);
            if (value == null || value == JSONObject.NULL || (value instanceof Map) || (value instanceof JSONObject)) {
                return getValue(value, strArrSplit[1], i11);
            }
            if (i10 > 0) {
                try {
                    objEncode = PointerEncoder.get().encode(value);
                } catch (Exception unused) {
                }
                if (objEncode instanceof JSONObject) {
                    return getValue(objEncode, strArrSplit[1], i11);
                }
            }
            throw new ParseException(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, d.b("Key ", str, " is invalid."));
        }
        if (!(obj instanceof ParseObject)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).opt(str);
            }
            if (obj instanceof Map) {
                return ((Map) obj).get(str);
            }
            if (obj == JSONObject.NULL || obj == null) {
                return null;
            }
            throw new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMinor, "Bad key: ".concat(str));
        }
        ParseObject parseObject = (ParseObject) obj;
        if (!parseObject.isDataAvailable()) {
            throw new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMinor, "Bad key: ".concat(str));
        }
        switch (str.hashCode()) {
            case -1949194674:
                if (!str.equals("updatedAt")) {
                    b10 = -1;
                }
                break;
            case -1836974455:
                b10 = !str.equals("_created_at") ? (byte) -1 : (byte) 1;
                break;
            case 90495162:
                b10 = !str.equals("objectId") ? (byte) -1 : (byte) 2;
                break;
            case 598371643:
                b10 = !str.equals("createdAt") ? (byte) -1 : (byte) 3;
                break;
            case 792848342:
                b10 = !str.equals("_updated_at") ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 4:
                return parseObject.getUpdatedAt();
            case 1:
            case 3:
                return parseObject.getCreatedAt();
            case 2:
                return parseObject.getObjectId();
            default:
                return parseObject.get(str);
        }
    }

    private static ParseQuery.KeyConstraints cleanRegexStartsWith(ParseQuery.KeyConstraints keyConstraints) {
        if (!isStartsWithRegex(keyConstraints)) {
            return null;
        }
        keyConstraints.put("$regex", ((String) keyConstraints.get("$regex")).replaceAll("([^\\\\])(\\\\E)", "$1").replaceAll("([^\\\\])(\\\\Q)", "$1").replaceAll("^\\\\E", "").replaceAll("^\\\\Q", "").replaceAll("([^'])'", "$1''").replaceAll("^'([^'])", "''$1") + ".*");
        return keyConstraints;
    }

    private <T extends ParseObject> ConstraintMatcher<T> createMatcher(ParseUser parseUser, ParseQuery.QueryConstraints queryConstraints) {
        final ArrayList arrayList = new ArrayList();
        for (final String str : queryConstraints.keySet()) {
            final Object obj = queryConstraints.get(str);
            if (str.equals("$or")) {
                arrayList.add(createOrMatcher(parseUser, (ArrayList) obj));
            } else if (obj instanceof ParseQuery.KeyConstraints) {
                ParseQuery.KeyConstraints keyConstraints = (ParseQuery.KeyConstraints) obj;
                for (String str2 : keyConstraints.keySet()) {
                    arrayList.add(createMatcher(parseUser, str2, keyConstraints.get(str2), str, keyConstraints));
                }
            } else if (obj instanceof ParseQuery.RelationConstraint) {
                final ParseQuery.RelationConstraint relationConstraint = (ParseQuery.RelationConstraint) obj;
                arrayList.add(new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.19
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
                    @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
                    public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                        return Task.forResult(Boolean.valueOf(relationConstraint.getRelation().hasKnownObject(parseObject)));
                    }
                });
            } else {
                arrayList.add(new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.20
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
                    @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
                    public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                        try {
                            return Task.forResult(Boolean.valueOf(OfflineQueryLogic.matchesEqualConstraint(obj, OfflineQueryLogic.getValue(parseObject, str))));
                        } catch (ParseException e10) {
                            return Task.forError(e10);
                        }
                    }
                });
            }
        }
        return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.21
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
            @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
            public Task matchesAsync(final ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
                Task taskForResult = Task.forResult(Boolean.TRUE);
                for (final ConstraintMatcher constraintMatcher : arrayList) {
                    taskForResult = taskForResult.onSuccessTask(new Continuation<Boolean, Task<Boolean>>() { // from class: com.parse.OfflineQueryLogic.21.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Boolean> then(Task<Boolean> task) {
                            return !task.getResult().booleanValue() ? task : constraintMatcher.matchesAsync(parseObject, parseSQLiteDatabase);
                        }
                    });
                }
                return taskForResult;
            }
        };
    }

    public <T extends ParseObject> ConstraintMatcher<T> createMatcher(ParseQuery.State<T> state, ParseUser parseUser) {
        final boolean zIgnoreACLs = state.ignoreACLs();
        final ConstraintMatcher<T> constraintMatcherCreateMatcher = createMatcher(parseUser, state.constraints());
        return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.22
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
            @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
            public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                return (zIgnoreACLs || OfflineQueryLogic.hasReadAccess(this.user, parseObject)) ? constraintMatcherCreateMatcher.matchesAsync(parseObject, parseSQLiteDatabase) : Task.forResult(Boolean.FALSE);
            }
        };
    }
}
