//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.chumbok.news.service;

import android.content.Context;
import com.chumbok.news.FeedItemList_;
import com.chumbok.news.adapter.FeedListAdapter_;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class FeedService_
    extends FeedService
{

    private Context context_;
    private static FeedService_ instance_;

    private FeedService_(Context context) {
        context_ = context;
    }

    public static FeedService_ getInstance_(Context context) {
        if (instance_ == null) {
            OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(null);
            instance_ = new FeedService_(context.getApplicationContext());
            instance_.init_();
            OnViewChangedNotifier.replaceNotifier(previousNotifier);
        }
        return instance_;
    }

    private void init_() {
        listAdapter = FeedListAdapter_.getInstance_(context_);
        feedItemList = FeedItemList_.getInstance_(context_);
        initAdapter();
    }

}