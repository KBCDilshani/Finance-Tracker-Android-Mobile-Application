package com.example.fintrack.ui.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fintrack.R
import com.example.fintrack.databinding.ItemOnboardingBinding

class OnboardingViewPagerAdapter : RecyclerView.Adapter<OnboardingViewPagerAdapter.OnboardingViewHolder>() {

    private val onboardingItems = listOf(
        OnboardingItem(
            "Welcome to FinTrack",
            "Take control of your finances and build a better financial future",
            R.drawable.onbording2
        ),
        OnboardingItem(
            "Smart Budgeting",
            "Set monthly budgets, monitor your spending, and avoid overspending with real-time insights",
            R.drawable.onboarding1
        ),
        OnboardingItem(
            "Secure & Private",
            "We use bank-level encryption to keep your personal and financial information secure",
            R.drawable.onboarding3
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        val binding = ItemOnboardingBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OnboardingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        holder.bind(onboardingItems[position])
    }

    override fun getItemCount() = onboardingItems.size

    class OnboardingViewHolder(private val binding: ItemOnboardingBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: OnboardingItem) {
            binding.textTitle.text = item.title
            binding.textDescription.text = item.description
            binding.imageOnboarding.setImageResource(item.imageResId)
        }
    }

    data class OnboardingItem(
        val title: String,
        val description: String,
        val imageResId: Int
    )

}