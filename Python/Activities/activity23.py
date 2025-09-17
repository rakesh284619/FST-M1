import pytest

@pytest.mark.activity23
@pytest.mark.skip
def test_sum(num_list):
    # Initialize sum
    sum = 0
    # Add number in the list
    for n in num_list:
        sum += n
    # Assertion
    assert sum == 55

@pytest.mark.activity23
def test_sum1(num_list1):
    sum =0
    for n in num_list1:
        sum += n
    assert sum == 1180