vote = {}

def check_voted(name):
    if vote.get(name):
        print("kick them out")
    else:
        vote[name] = True
        print("let them to vote")

check_voted("dulanga")
check_voted("Heshan")
check_voted("dulanga")

# #let them to vote
# let them to vote
# kick them out