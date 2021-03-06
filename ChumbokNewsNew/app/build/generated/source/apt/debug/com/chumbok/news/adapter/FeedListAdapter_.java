//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.chumbok.news.adapter;

import android.content.Context;
import android.util.Log;
import com.chumbok.news.FeedItemList_;
import com.chumbok.news.MainActivity;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class FeedListAdapter_
    extends FeedListAdapter
{

    private Context context_;
    private static FeedListAdapter_ instance_;

    private FeedListAdapter_(Context context) {
        context_ = context;
    }

    public static FeedListAdapter_ getInstance_(Context context) {
        if (instance_ == null) {
            OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(null);
            instance_ = new FeedListAdapter_(context.getApplicationContext());
            instance_.init_();
            OnViewChangedNotifier.replaceNotifier(previousNotifier);
        }
        return instance_;
    }

    private void init_() {
        feedItemList = FeedItemList_.getInstance_(context_);
        if (context_ instanceof MainActivity) {
            activity = ((MainActivity) context_);
        } else {
            Log.w("FeedListAdapter_", (("Due to Context class "+ context_.getClass().getSimpleName())+", the @RootContext MainActivity won't be populated"));
        }
        context = context_;
        initAdapter();
    }

}
